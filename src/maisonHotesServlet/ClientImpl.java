package maisonHotesServlet;

import java.util.Date;

public class ClientImpl implements Client {

	
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String region;
	private String parking;
	private String animal;
	private String fumeur;
	private String nbrePersonnes;
	private String jourArrivee;
	private String nuitees;
	private String resaId;
	private Date dateResa;
	
	private static int compteur;
	
	public ClientImpl () {
		resaId = Integer.toString(compteur);
		compteur++;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getFumeur() {
		return fumeur;
	}

	public void setFumeur(String fumeur) {
		this.fumeur = fumeur;
	}
	
	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getNbrePersonnes() {
		return nbrePersonnes;
	}

	public void setNbrePersonnes(String nbrePersonnes) {
		this.nbrePersonnes = nbrePersonnes;
	}
	
	public String getJourArrivee() {
		return jourArrivee;
	}

	public void setJourArrivee(String jourArrivee) {
		this.jourArrivee = jourArrivee;
	}
	
	public String getNuitees() {
		return nuitees;
	}

	public void setNuitees(String nuitees) {
		this.nuitees = nuitees;
	}
	
	public String getResaId() {
		return resaId;
	}
	
	public void setResaId(String resaId) {
		this.resaId = resaId;
	}
	
	public Date getDateResa() {
		return dateResa;
	}

	public void setDateResa(Date dateResa) {
		this.dateResa = dateResa;
	}
}
