<%-- 
    Document   : tabellinadel5
    Created on : 4 apr 2023, 10:29:56
    Author     : Studente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabellina del 5</title>
    </head>
    <body>       
        https://html5-editor.net/
        <h1>Tabellina del 5</h1>

        <table border="1">
            <tr>
                <th bgcolor="grey"></td>
                <th bgcolor="grey">5</td>
            </tr>
            <%
                for(int i=1;i<=10;i++){
            %>
            <tr>
                <th bgcolor="grey">
                    <%
                    out.println(i);
                    %>
                </th>
                <td bgcolor="yellow">
                    <%
                    out.println(5*i);
                    %>
                </td>
            </tr>
            <%
                }
            %>
        </table>

    </body>
</html>
