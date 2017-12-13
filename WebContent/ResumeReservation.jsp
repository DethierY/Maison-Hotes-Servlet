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
	<% Client newClient = (Client) request.getAttribute("newClient"); %>
	
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
			<p class="col s6 l3"><%=newClient.getNom()%></p>
			<p class="col s6 l3 couleur">Votre adresse :</p>
			<p class="col s6 l3"><%=newClient.getPrenom()%></p>
			<p class="col s6 l3 couleur">Votre adresse mail:</p>
			<p class="col s6 l3"><%=newClient.getEmail()%></p>
			<p class="col s6 l3 couleur">Votre telephone:</p>
			<p class="col s6 l3"><%=newClient.getTelephone()%></p>
			<div class="row class s6 l6 center">
				<p class="col s6 center couleur">Votre région: </p>
				<p class="col s6 center"><%=newClient.getRegion()%></p>
			</div>
		</div>
	</article>
	
	<article class="card-panel teal z-depth-3" id="options">
		<div class="row">
			<h2 class="center couleur">Options</h2>
			<p class="col S6 l2 couleur">Parking</p>
			<p class="col s6 l2"><%=newClient.getParking()%></p>
			<p class="col S6 l2 couleur">Animal</p>
			<p class="col s6 l2"><%=newClient.getAnimal()%></p>
			<p class="col s6 l2 couleur">Fumeur:</p>
			<p class="col s6 l2"><%=newClient.getFumeur()%></p>
		</div>
	</article>
	
	<article class="card-panel teal z-depth-3" id="options">
		<div class="row">
			<h2 class="center couleur">Séjour</h2>
			<p class="col S6 l2 couleur">Nombre de personnes:</p>
			<p class="col s6 l2"><%=newClient.getNbrePersonnes()%></p>
			<p class="col S6 l2 couleur">Date d'arrivée:</p>
			<p class="col s6 l2"><%=newClient.getJourArrivee()%></p>
			<p class="col s6 l2 couleur">Nombre de nuitées:</p>
			<p class="col s6 l2"><%=newClient.getNuitees()%></p>
		</div>
	</article>
	
	<div class="btn waves-effect waves-light">
        <a  href="Gestion">Valider</a>
    </div>
    <div class="btn waves-effect waves-light">
        <a href="reservation.html">Retour</a>
    </div>

</body>
</html>