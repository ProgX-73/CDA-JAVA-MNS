package poo1;
import java.sql.*;

/**
 * Une Classe pour représenter les données.
 * La chaque ligne de la table personne en DB représente une personne
 * pour manipuler une 'personne' dans mon application, il sera commode de la formaliser par une classe dédiée Personne.
 * Chaque instance représentant une personne.
 * La mécanique si dessous montre la créatione et chargement de ces instances.  
 */
public class TestClientSQL {
	
	public static void main(String[] args)throws  SQLException, ClassNotFoundException
	{
		Connection connection;
	
		String  driver, 
		        url,
		        user,
		        password;
	
		driver = "com.mysql.cj.jdbc.Driver"; 		// classe constituant le driver 
		//pour mySQL
	
		//driver  = "sun.jdbc.odbc.JdbcOdbcDriver";     //pour un SGBD suivant le protocole ODBC
	
				url = "jdbc:mysql://localhost/velo";
				user = "root";
				password = "root";
				
				Class.forName(driver); // en cas d'échec  : throws ClassNotFoundException
				
				connection = DriverManager.getConnection(url,user,password);// en cas d'échec : throws SQLException
				
				Statement statement = connection.createStatement();
				
				String requête = "SELECT * FROM personne WHERE 1";
				
				ResultSet résultat = statement.executeQuery(requête);
				
				System.out.println("table des scores : ");
				
				while(résultat.next())
				    {
				    int iDLigne, age;
				    String name, forename;
				    
				    iDLigne = résultat.getInt(1);
				    name = résultat.getString(2);
				    forename = résultat.getString(3);
				    age = résultat.getInt(4);
				    //pour chaque ligne de la table, création d'un objet Personne
				    Personne personne = new Personne(résultat.getInt(1),résultat.getString(2),résultat.getString(3),résultat.getInt(4));
				    
				    //L'affichage vient de toString dans la classe personne
				    System.out.println(personne);
				    }//while

				
			connection.close();
	}
}
// main
