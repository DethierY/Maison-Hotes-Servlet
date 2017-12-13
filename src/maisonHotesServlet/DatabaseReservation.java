package maisonHotesServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReservation {

	private final static String BDPATH = "jdbc:mysql://localhost:3306/reservation";
	private final static String DBUSER = "admin";
	private final static String DBPASSWORD = "admin";
	
	private static Connection connection;
	
	public void connectionBase() throws ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver");
		try {
			connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
			System.out.println("connexion ok");
		}
		catch (SQLException e) {
			System.out.println("SQLException connection");
		}
		
	}
	
	public void couperConnection () throws SQLException {
		connection.close();
		System.out.println("connection fermée");
	}
	
	public void ecritureBase(String nom, String prenom, String email, String telephone, String region, String parking, String animal, String fumeur, String nbrePersonnes, String jourArrivee, String nuitees) throws SQLException{
		
		Statement statement = null;

		try {
			statement = connection.createStatement();
			String sql = "INSERT INTO listereservations (`nom`, `prenom`, `email`, `telephone`, `region`, `parking`, `animal`, `fumeur`, `nbrePersonnes`, `jourArrivee`, `nuitees`) VALUES ('" + nom + "', '" + prenom + "' , '" + email + "' , '" + telephone + "', '" + region + "' , '" + parking + "', '" + animal + "', '" + fumeur + "', '" + nbrePersonnes + "', '" + jourArrivee + "', '" + nuitees + "')";
			statement.executeUpdate(sql);
			System.out.println("logiquement, écriture dans la table ok");
		}
		catch(SQLException e){
			System.out.println("SQLException écriture");
		}
		finally{	 
			statement.close();
		}
	}
	
	public void lectureBase () throws SQLException {
	
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			statement = connection.createStatement();
			String sql = "SELECT * FROM listereservations";
		
			rs = statement.executeQuery(sql);
	
			while (rs.next()) {
			
			Client dataClient = new ClientImpl ();
			dataClient.setNom(rs.getString("nom"));
			dataClient.setPrenom(rs.getString("prenom"));
			dataClient.setEmail(rs.getString("email"));
			dataClient.setTelephone(rs.getString("telephone"));
			dataClient.setRegion(rs.getString("region"));
			dataClient.setParking(rs.getString("parking"));
			dataClient.setAnimal(rs.getString("animal"));
			dataClient.setFumeur(rs.getString("fumeur"));
			dataClient.setNbrePersonnes(rs.getString("nbrePersonnes"));
			dataClient.setJourArrivee(rs.getString("jourArrivee"));
			dataClient.setNuitees(rs.getString("nuitees"));
			
			ClientsManager.getInstance().addClient(dataClient);
			}
		}
		
		catch(SQLException e){
			
			System.out.println("SQLException lecture");
		}
		
		finally{	
			
			statement.close();
		}
	}
}
