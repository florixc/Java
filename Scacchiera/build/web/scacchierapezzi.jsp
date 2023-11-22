<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scacchiera</title>
    </head>
    <body>       
        <h1>Scacchiera pezzi</h1>
        <%
            boolean fine;
            int casuale;
            int conta[] = {0, 0, 0, 0, 0, 0};  //in alternativa sarebbe duvuto essere new int[6] e poi ciclo
            String pezzo[] = {"pedone.png", "torre.png", "cavallo.png", "alfiere.png", "regina.png", "re.png"};
            String pezzolink[] = {"https://it.wikipedia.org/wiki/Pedone_(scacchi)", "https://it.wikipedia.org/wiki/Torre_(scacchi)", "https://it.wikipedia.org/wiki/Cavallo_(scacchi)", "https://it.wikipedia.org/wiki/Alfiere_(scacchi)", "https://it.wikipedia.org/wiki/Donna_(scacchi)", "https://it.wikipedia.org/wiki/Re_(scacchi)"};
            for (int i = 0; i < 100; i++) {
                casuale = (int) (Math.random() * pezzo.length);
                conta[casuale]++;
            }
        %> 
        <ul>
            <%
                for (int i = 0; i < pezzo.length; i++) {
            %> 
            <li>
                <img src="<%=pezzo[i]%>" width="30" height="30"/> <%=conta[i]%>
            </li>
            <%                }
            %>
        </ul>

    </body>
</html>
