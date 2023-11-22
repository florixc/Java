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
        <title>Scacchiera</title>
    </head>
    <body>       
        <h1>Scacchiera</h1>
        <table border="1" width=300" height="300">
            <%
                
                for (int i = 0; i < 8; i++) {
            %>
            <tr>
                <%
                    for (int j = 0; j < 8; j++) {
                        String sfondo = "";
                        if ((i + j) % 2 == 0)
                            sfondo = "white";
                        else
                            sfondo = "black";
                %>
                <td bgcolor="<%=sfondo%>">
                    &nbsp;
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
