<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE html PUBLIC 
	"-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<%!
String s1 = (String)request.getAttribute("name");
String s2 = (String)request.getAttribute("surname");
%>
<html>
	<head>
	<title>
	Just having some fun...
	</title>
	</head>
	<body>
		<br>
			<hr color="#0000ff" size="5" width="98%">
		<br>
		<table align="center" width="75%">
			<tbody>
			<tr align="center" valign="middle">
				<td bgcolor="cyan">
					<h2 align="center">Surprise!</h2>
				</td>
			</tr>
			</tbody>
		</table>
		<br>
			<hr color="#0000ff" size="5" width="98%">
		<br>
		<table align="center" cellpadding="10" cellspacing="10">
		<tbody>
		<tr align="center" valign="center">
			<td bgcolor="yellow">
				<%= s1 %> 
			</td>
			<td bgcolor="yellow">
				<%= s2 %>
			</td>
		</tr>
		</tbody>
		</table>
		</form>
	</body>
</html>