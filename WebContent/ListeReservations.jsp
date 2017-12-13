<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="maisonHotesServlet.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection" />
    <link type="text/css" rel="stylesheet" href="css/styleManoir.css" />
    
	<meta charset="UTF-8">
	
	<title>Liste réservations</title>
</head>
<body>
	<table border="1" class="resaTable">
		<tr>
			<th>Id Résa</th>
			<th>dateResa</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>email</th>
			<th>Téléphone</th>
			<th>Region</th>
			<th>Parking</th>
			<th>Animal</th>
			<th>Fumeur</th>
			<th>Nombre de personnes</th>
			<th>Date d'arrivée</th>
			<th>nombre de nuitées</th>
		</tr>
		<%
		
			SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Collection<Client> listeClients = (Collection<Client>) request.getAttribute("listeResas");
			if(listeClients != null){
				Iterator it = listeClients.iterator() ;
			    while (it.hasNext()){
			    	Client serveur=(Client) it.next() ;
		%>
			<tr>
				<td><%=serveur.getResaId() %></td>
				<td><%=dateFormater.format(serveur.getDateResa())%></td>	
				<td><%=serveur.getNom()%></td>
				<td><%=serveur.getPrenom()%></td>
				<td><%=serveur.getEmail()%></td>
				<td><%=serveur.getTelephone()%></td>
				<td><%=serveur.getRegion()%></td>
				<td><%=serveur.getParking()%></td>
				<td><%=serveur.getAnimal()%></td>
				<td><%=serveur.getFumeur()%></td>
				<td><%=serveur.getNbrePersonnes()%></td>
				<td><%=serveur.getJourArrivee()%></td>
				<td><%=serveur.getNuitees()%></td>
			</tr>
		<%      }
			}
		%>
	</table>
</body>
</html>