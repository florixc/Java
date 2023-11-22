<%-- 
    Document   : primojsp
    Created on : 1 apr 2023, 10:49:32
    Author     : L14_00
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!oo</h1>
        <h1>
        <%            
            System.out.println("Hello World! (con system non funziona)");   
            out.println("Hello World!");
        %>
        </h1>
        <h2>
        <%            
            for (int i=1;i<=10;i++)   
                out.println("Hello "+i+"<br>");
        %>
        </h2>
    </body>
</html>
