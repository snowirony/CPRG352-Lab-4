package models;

/**
 *
 * @author Ronald Tran
 * @version February 10, 2022
 */
public class Note 
{
    // Attributes
    private String title = "";
    private String content = "";
    
    // User-defined constructor
    public Note(String title, String content) 
    {
        this.title = title;
        this.content = content;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getContent()
    {
        return content;
    }
    
    public void setContent(String content)
    {
        this.content = content;
    }
}
