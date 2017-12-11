package maisonHotesServlet;

import java.io.IOException;
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
@WebServlet("/Coordonnees")
public class Coordonnees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coordonnees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
		
		
		Client client = new ClientImpl ();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setEmail(email);
		client.setTelephone(telephone);
		client.setRegion(region);
		client.setFumeur(fumeur);
		client.setParking(parking);
		client.setAnimal(animal);
		client.setNbrePersonnes(nbrePersonnes);
		client.setJourArrivee(jourArrivee);
		client.setNuitees(nuitees);
		
		List<Client> listeClients = new ArrayList<> ();
		
		request.setAttribute("client", client);
		listeClients.add(client);
		
		getServletContext().getRequestDispatcher("/ResumeClient.jsp").forward(request, response);
		
		
		
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
