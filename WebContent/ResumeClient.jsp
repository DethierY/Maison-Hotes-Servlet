<%@page import="maisonHotesServlet.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection" />
    <link type="text/css" rel="stylesheet" href="css/commun.css" />
    <link type="text/css" rel="Stylesheet" href="css/ResumeClient.css" />

	<meta http-equiv="Content-Type" content="text/html">
<title>ResumeClient</title>
</head>
<body>
	<% Client client = (Client) request.getAttribute("client"); %>
	
	 <!--Bandeau haut de page-->
    <div class="backgroundImg">
    </div>
    
    <!-- Titre de la page -->
	<header class="center">
    	<div class="card-panel teal z-depth-3">
            <h1>R�sum�</h1>
        </div>
            <p class="text">V�rifiez vos informations</p>
    </header>
    
	<article class="card-panel teal z-depth-3" id="coordonnees">
		<div class="row">
			<h2 class="center couleur">Coordonn�es</h2>
			<p class="col s6 l3 couleur">Votre nom</p>
			<p class="col s6 l3"><%=client.getNom() %></p>
			<p class="col s6 l3 couleur">Votre adresse :</p>
			<p class="col s6 l3"><%=client.getPrenom() %></p>
			<p class="col s6 l3 couleur">Votre adresse mail:</p>
			<p class="col s6 l3"><%=client.getEmail() %></p>
			<p class="col s6 l3 couleur">Votre telephone:</p>
			<p class="col s6 l3"><%=client.getTelephone() %></p>
			<div class="row class s6 l6 center">
				<p class="col s6 center couleur">Votre r�gion: </p>
				<p class="col s6 center"><%=client.getRegion() %></p>
			</div>
		</div>
	</article>
	
	<article class="car-panel teal z-depth-3" id="options">
		<div class="row">
			<h2 class="center couleur">Options</h2>
			<p class="col s6 center couleur">Fumeur:</p>
			<p class="col s6 center"><%=client.getFumeur() %></p>
		</div>
	</article>

</body>
</html>