package maisonHotesServlet;

import java.sql.Connection;
import java.sql.DriverManager;
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
			System.out.println("Error SQLException");
		}
		
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
			System.out.println("Error SQLException");
		}
		finally{	 
			statement.close();
		}
	}
	
}
