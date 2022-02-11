package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // Get the text file from the folder directory
        final String TEXT_FILE = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        // Read the contents in note.txt (Referenced from Lab #4 sheet)
        BufferedReader text = new BufferedReader(new FileReader(new File(TEXT_FILE)));
        
        // Implementing contents into variables
        String title = text.readLine();
        String content = text.readLine();
        text.close();
        
        // Creating object from Note.java
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        String edit = request.getParameter("edit");
        
        if (edit == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        else if (edit == "")
        {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        // Edit variables
        String editTitle = request.getParameter("edit_title");
        String editContent = request.getParameter("edit_contents");
        
        // File directory
        String file = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        // PrintWriter method to save changes into note.txt
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
        
        pw.println(editTitle);
        pw.println(editContent);
        pw.close();
        
        Note editNote = new Note(editTitle, editContent);
        request.setAttribute("note", editNote);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

}
