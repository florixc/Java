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
        <title>Tabellina</title>
    </head>
    <body>       
        https://html5-editor.net/
        <h1>Tabellina</h1>
        <table border="1">
            <tr>
                <th bgcolor="grey"></th>
                    <%
                        for (int i = 1; i <= 10; i++) {
                    %>
                <th bgcolor="grey">
                    <%
                        out.println(i);
                    %>
                </th>
                <%
                    }
                %>
            </tr>
            <%
                for (int i = 1; i <= 10; i++) {
            %>
            <tr>
                <th bgcolor="grey">
                    <%
                        out.println(i);
                    %>
                </th>
                <%
                    for (int j = 1; j <= 10; j++) {
                %>
                <td bgcolor="yellow">
                    <%
                        out.println(i * j);
                    %>
                </td>
                <%
                    }
                %>
            </tr>
            <%
                }
            %>
        </table>

    </body>
</html>
