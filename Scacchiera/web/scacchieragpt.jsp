<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Scacchiera</title>
	<style>
		td {
			height: 50px;
			width: 50px;
			text-align: center;
			vertical-align: middle;
			font-size: 24px;
		}
		.white {
			background-color: #ffffff;
		}
		.black {
			background-color: #000000;
			color: #ffffff;
		}
	</style>
</head>
<body>
	<table>
		<% for(int i=1; i<=8; i++) { %>
			<tr>
			<% for(int j=1; j<=8; j++) { %>
				<td class="<%= (i+j)%2==0 ? "white" : "black" %>">
					<%= Character.toChars(97+j-1)[0] %><%= 8-i+1 %>
				</td>
			<% } %>
			</tr>
		<% } %>
	</table>
</body>
</html>