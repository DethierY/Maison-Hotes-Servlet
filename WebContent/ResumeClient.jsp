<%@page import="maisonHotesServlet.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ResumeClient</title>
</head>
<body>
	<% Client client = (Client) request.getAttribute("client"); %>
	
	<h2>Coordonnées</h2>
		<p>Votre nom</p>
		<p><%=client.getNom() %></p>
		<p>Votre adresse :</p>
		<p><%=client.getPrenom() %></p>
		<p>Votre adresse mail:</p>
		<p><%=client.getEmail() %></p>
		<p>Votre telephone:</p>
		<p><%=client.getTelephone() %></p>

</body>
</html>