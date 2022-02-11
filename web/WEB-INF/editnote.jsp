<%-- 
    Document   : editnote
    Created on : Feb 10, 2022, 7:28:57 PM
    Author     : Ronald Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form action="note" method="POST">
            <div name="title">
                <h1>Simple Note Keeper</h1>
                <h2>Edit Note</h2>
            </div>
            
            <div>
                <label>Title:</label>
                <input type="text" name="edit_title" value="${note.title}">
                <br>
                <label>Contents:</label>
                <textarea name="edit_contents" placeholder="${note.content}"></textarea>
                <br>
                <input type="submit" value="Save">
                </div>
        </form>
    </body>
</html>
