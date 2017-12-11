<%@page import="maisonHotesServlet.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection" />
    <link type="text/css" rel="stylesheet" href="css/styleManoir.css" />

	<meta charset="UTF-8"/>
	
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
            <h1>Résumé</h1>
        </div>
            <p class="header_text">Vérifiez vos informations</p>
    </header>
    
	<article class="card-panel teal z-depth-3" id="coordonnees">
		<div class="row">
			<h2 class="center couleur">Coordonnées</h2>
			<p class="col s6 l3 couleur">Votre nom</p>
			<p class="col s6 l3"><%=client.getNom() %></p>
			<p class="col s6 l3 couleur">Votre adresse :</p>
			<p class="col s6 l3"><%=client.getPrenom() %></p>
			<p class="col s6 l3 couleur">Votre adresse mail:</p>
			<p class="col s6 l3"><%=client.getEmail() %></p>
			<p class="col s6 l3 couleur">Votre telephone:</p>
			<p class="col s6 l3"><%=client.getTelephone() %></p>
			<div class="row class s6 l6 center">
				<p class="col s6 center couleur">Votre région: </p>
				<p class="col s6 center"><%=client.getRegion() %></p>
			</div>
		</div>
	</article>
	
	<article class="card-panel teal z-depth-3" id="options">
		<div class="row">
			<h2 class="center couleur">Options</h2>
			<p class="col S6 l2 couleur">Parking</p>
			<p class="col s6 l2"><%=client.getParking() %></p>
			<p class="col S6 l2 couleur">Animal</p>
			<p class="col s6 l2"><%=client.getAnimal() %></p>
			<p class="col s6 l2 couleur">Fumeur:</p>
			<p class="col s6 l2"><%=client.getFumeur() %></p>
		</div>
	</article>
	
	<article class="card-panel teal z-depth-3" id="options">
		<div class="row">
			<h2 class="center couleur">Séjour</h2>
			<p class="col S6 l2 couleur">Nombre de personnes:</p>
			<p class="col s6 l2"><%=client.getNbrePersonnes() %></p>
			<p class="col S6 l2 couleur">Date d'arrivée:</p>
			<p class="col s6 l2"><%=client.getJourArrivee() %></p>
			<p class="col s6 l2 couleur">Nombre de nuitées:</p>
			<p class="col s6 l2"><%=client.getNuitees() %></p>
		</div>
	</article>

</body>
</html>