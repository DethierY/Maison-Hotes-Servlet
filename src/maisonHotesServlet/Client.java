package maisonHotesServlet;

import java.util.Date;

public interface Client {

		public String getNom();
		public void setNom(String nom);
		
		public String getPrenom();
		public void setPrenom(String prenom);
		
		public String getEmail();
		public void setEmail(String email);
		
		public String getTelephone();
		public void setTelephone(String telephone);
		
		public String getRegion();
		public void setRegion(String region);
		
		public String getParking();
		public void setParking(String parking);
		
		public String getAnimal();
		public void setAnimal(String animal);
		
		public String getFumeur();
		public void setFumeur(String fumeur);
		
		public int getNbrePersonnes();
		public void setNbrePersonnes(int nbrePersonnes);
		
		public String getJourArrivee();
		public void setJourArrivee(String jourArrivee);
		
		public int getNuitees();
		public void setNuitees(int nuitees);
		
		public String getResaId();
		public void setResaId(String resaId);
		
		public Date getDateResa();
		public void setDateResa(Date dateResa);
}
