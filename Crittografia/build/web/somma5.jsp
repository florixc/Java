<%-- 
    Document   : somma5
    Created on : 13 mag 2023, 10:51:51
    Author     : L14_00
--%>

<%@page import="crittografia.Decodifica"%>
<%@page import="javax.management.MBeanAttributeInfo"%>
<%@page import="crittografia.Codifica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <table>
            <tr>
                <th>casuale</th>
                <th>codifica</th> 
                <th>decodifica</th>
            </tr>
            <%
                for (int i = 0; i < 10; i++) {
                    int casuale = (int) (Math.random() * 10) + 1;
                    int codifica = Codifica.aggiungi5(casuale);
                    int decodifica = Decodifica.togli5(codifica);
            %>
            <tr>
                <td><%= casuale%></td>
                <td><%= codifica%></td> 
                <td><%= decodifica%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
