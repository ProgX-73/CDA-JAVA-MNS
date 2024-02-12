import java.sql.*;

/**
 * client SQL réalisant une requête sur une base de données très simple
 * contenant une table
 */
public class TestClientSQL {
	
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		Connection connection;
	
		String  driver, url, user, password;
	
		driver = "com.mysql.cj.jdbc.Driver"; 		// classe constituant le driver 
		//pour mySQL
	
				url = "jdbc:mysql://localhost/velo";
				user = "root";
				password = "root";
				
				//Charge la classe et référence le driver mysql qui sera dispo pour le Driver Manager
				Class.forName(driver); // en cas d'échec  : throws ClassNotFoundException
				
				//établissement de la connexion
				connection = DriverManager.getConnection(url,user,password);// en cas d'échec : throws SQLException
				
				//Statement : prépare l'échange avec la DB
				Statement statement = connection.createStatement();
				
				String requête = "SELECT * FROM personne WHERE 1";
				
				//Execution, et retour d'un Objet de type ResultSet
				// A table of data representing a database result set
				//(Cliquez le nom de la classe, laossez-vous emmener dans le source
				// les commentaires définisse l'objet et son fonctionnement
				ResultSet résultat = statement.executeQuery(requête);
				
				System.out.println("Donnée de la table : ");
				
				//parcours du résultat
				while(résultat.next())
				    {
				    int iDLigne, age;
				    String name, forename;
				    
				    //Exctraction des données vers des nos variables
				    iDLigne = résultat.getInt(1);
				    name = résultat.getString(2);
				    forename = résultat.getString(3);
				    age = résultat.getInt(4);
				    
				    
				    System.out.
				    println("ID Ligne : "+iDLigne+" name : "+name+" score1 : "+forename+" forename : "+forename+" pseudo2 : "+age);
				    }//while

			connection.close();
	}
}
// main
