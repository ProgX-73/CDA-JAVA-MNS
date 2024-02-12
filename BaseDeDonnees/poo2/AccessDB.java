package poo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccessDB {

	//L'objet connection est un champ de la classe accessible partout dans la classe.
	private Connection connection;
	
	private String  driver; 
	private String  url;
	private String  user;
	private String  password;
	
	/**
	 * Ici on charge et on se connecte à la DB
	 * On garde la connection ouverte.....(c'est pas forcément une bonne idée suivant le contexte)
	 * Jusqu'à que la méthode close soit appelée 
	 */
	public AccessDB() throws ClassNotFoundException, SQLException {
		super();
		driver = "com.mysql.cj.jdbc.Driver"; 		// classe constituant le driver 
		url = "jdbc:mysql://localhost/velo";
		user = "root";
		password = "root";
		
		Class.forName(driver); // en cas d'échec  : throws ClassNotFoundException
		connection = DriverManager.getConnection(url,user,password);
	}

	/**
	 * On empacte tout le traitement précédent dans une petite methode
	 * séparée du Main
	 * Mais est-ce le meilleur endroit pour cette méthode ...
	 */
	public ArrayList<Personne> RequestDb(String request) throws SQLException {
		
		//Pour chaque requete on ouvre et on referme la connection.
		//on ne monopolise pas l'accès à la DB
		//connection = DriverManager.getConnection(url,user,password);// en cas d'échec : throws SQLException
		
		Statement statement = connection.createStatement();
		ResultSet résultat =	statement.executeQuery(request);
		ArrayList<Personne> listPersonne = new ArrayList<Personne>();
		while(résultat.next())
	    {
		    int iDLigne, age;
		    String name, forename;
		    
		    iDLigne = résultat.getInt(1);
		    name = résultat.getString(2);
		    forename = résultat.getString(3);
		    age = résultat.getInt(4);
		    Personne p = new Personne(résultat.getInt(1),résultat.getString(2),résultat.getString(3),résultat.getInt(4));
		    //Ajout de la personne à la liste qui finalement représente la tabel entière 
		    listPersonne.add(p);
		 
	    }//while
		
		return listPersonne;
	}

	public void close() throws SQLException {
		connection.close();
		
	}
	
	
	
}
