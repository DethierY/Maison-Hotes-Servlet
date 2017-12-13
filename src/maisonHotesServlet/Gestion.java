package maisonHotesServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EssaisServlet
 */
@WebServlet("/Gestion")
public class Gestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gestion() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    DatabaseReservation database = new DatabaseReservation ();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("listeResas", ClientsManager.getInstance().getListeResas().values());
		
		getServletContext().getRequestDispatcher("/ListeReservations.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String regionPost = request.getParameter("region");
		String region = verifRegion(regionPost);
		String parkingPost = request.getParameter("parking");
		String parking = checkBox(parkingPost);
		String animalPost = request.getParameter("animal");
		String animal = checkBox(animalPost);
		String fumeur = request.getParameter("fumeur");
		String nbrePersonnes = request.getParameter("nbrePersonnes");
		String jourArrivee = request.getParameter("jourArrivee");
		String nuitees = request.getParameter("nuitees");
		
		Client newClient = new ClientImpl();
		newClient.setNom(nom);
		newClient.setPrenom(prenom);
		newClient.setEmail(email);
		newClient.setTelephone(telephone);
		newClient.setRegion(region);
		newClient.setFumeur(fumeur);
		newClient.setParking(parking);
		newClient.setAnimal(animal);
		newClient.setNbrePersonnes(nbrePersonnes);
		newClient.setJourArrivee(jourArrivee);
		newClient.setNuitees(nuitees);
		
		ClientsManager.getInstance().addClient(newClient);
		
		request.setAttribute("newClient", newClient);
		getServletContext().getRequestDispatcher("/ResumeReservation.jsp").forward(request, response);
		try {
			database.connectionBase();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			database.ecritureBase( nom, prenom, email, telephone, region, fumeur, parking, animal, nbrePersonnes, jourArrivee, nuitees);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private String checkBox (String choixCheckBox) {
		String reponse;
		if (choixCheckBox != null) {
			reponse = "oui";
		}
		else {
			reponse = "non";
		}
		return reponse;
	}
	
	private String verifRegion (String reponseRegion) {
		String reponse;
		if (reponseRegion != null) {
			reponse = reponseRegion;;
		}
		else {
			reponse = "Non renseignée";
		}
		return reponse;
	}
	
}
