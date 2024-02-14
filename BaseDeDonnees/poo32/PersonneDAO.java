package poo32;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * DAO DataAccessObject
 * Une classe dédiée à la manipulation des Personnes
 * Utilise l'objet AccessDB pour communiquer et lancer les requêtes
 * vers la DB 
 */
public class PersonneDAO {
	private static AccessDB db;
	private static final String request_list = "SELECT * FROM personne WHERE 1";
	private static final String request_save = "INSERT INTO `personne` (`id`, `nom`, `prenom`, `age`) VALUES (NULL, 'p_nom', 'p_prenom', 'p_age');";
	
public static ArrayList<Personne> list() throws SQLException, ClassNotFoundException {
		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat =	statement.executeQuery(request_list);
		ArrayList<Personne> listPersonne = new ArrayList<Personne>();
		while(résultat.next())
	    {
		    int iDLigne, age;
		    String name, forename;
		    iDLigne = résultat.getInt(1);
		    name = résultat.getString(2);
		    forename = résultat.getString(3);
		    age = résultat.getInt(4);
		    listPersonne.add(new Personne(résultat.getInt(1),résultat.getString(2),résultat.getString(3),résultat.getInt(4)));
		 
	    }//while
		connection.close();
		return listPersonne;
	}

public static void save(Personne p) throws SQLException, ClassNotFoundException {
	Connection connection = connectDB();
	Statement statement = connection.createStatement();
	String sqlInsert = request_save.replace("p_age",""+p.getAge()).replace("p_nom", p.getNom()).replace("p_prenom",p.getPrenom());
	statement.executeUpdate(sqlInsert);
	connection.close();
}
	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db==null?new AccessDB():db);
		return  db.getConnection();
	}
}
