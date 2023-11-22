<%-- 
    Document   : cesare
    Created on : 16 mag 2023, 11:16:13
    Author     : Studente
--%>

<%@page import="crittografia.Cesare"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cesare</h1>
        <table>
            <tr>
                <td>parola</td>
                <td>codifica</td> 
                <td>decodifica</td>
            </tr>
            <%
                String parola[] = {"ciao", "pupazzi", "tutti", "gialli"};
                int scarto = 6;
                Cesare cesare = new Cesare(scarto);
                for (int i = 0; i < parola.length; i++) {
                    String codifica = cesare.codifica(parola[i]);
                    String decodifica = cesare.decodifica(codifica);
            %>
            <tr>
                <td><%= parola[i]%></td>
                <td><%= codifica%></td> 
                <td><%= decodifica%></td>
            </tr>  
            <%
                }
            %>
        </table>

    </body>
</html>
