<%-- 
    Document   : viewnote
    Created on : Feb 10, 2022, 7:28:42 PM
    Author     : Ronald Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <div name="title">
            <h1>Simple Note Keeper</h1>
            <h2>View Note</h2>
        </div>
        
        <div name="body">
            <h4>Title:</h4>
            <p>${note.title}</p>
            <h4>Contents:</h4>
            <p>${note.content}</p>
        </div>
        
        <a href="note?edit">Edit</a>
    </body>
</html>
