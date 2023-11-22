<%-- 
    Document   : tabellinadel5
    Created on : 4 apr 2023, 10:29:56
    Author     : Studente
--%>

<%@page import="java.util.Scanner"%>
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
                int contaRe = 0; //posizione 5
                boolean fine;
                int casuale;
                String pezzo[] = {"pedone.png", "torre.png", "cavallo.png", "alfiere.png", "regina.png", "re.png"};
                String pezzolink[] = {"https://it.wikipedia.org/wiki/Pedone_(scacchi)", "https://it.wikipedia.org/wiki/Torre_(scacchi)", "https://it.wikipedia.org/wiki/Cavallo_(scacchi)", "https://it.wikipedia.org/wiki/Alfiere_(scacchi)", "https://it.wikipedia.org/wiki/Donna_(scacchi)", "https://it.wikipedia.org/wiki/Re_(scacchi)"};
                for (int i = 0; i < 8; i++) {
            %>
            <tr>
                <%
                    for (int j = 0; j < 8; j++) {
                        String sfondo = "";
                        if ((i + j) % 2 == 0) {
                            sfondo = "white";
                        } else {
                            sfondo = "black";
                        }
                        do {
                            fine = true;
                            casuale = (int) (Math.random() * pezzo.length);
                             if (casuale == 5) {
                                contaRe++;
                            }
                            if (casuale == 5 && contaRe > 1) {
                                fine = false;
                            }
                        } while (fine == false);
                %>
                <td bgcolor="<%=sfondo%>">
                    <a href="<%=pezzolink[casuale]%>"><img src="<%=pezzo[casuale]%>" width="30" height="30"/></a>
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
