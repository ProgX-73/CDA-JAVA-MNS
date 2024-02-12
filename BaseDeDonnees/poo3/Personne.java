package poo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Personne est l'objet qui accueille maintenant les données pour chaque personne
 * mais on lui donne aussi les méthode pour récupérer depuis la base de données.
 * Voyez les champs privés destinés aux instances seront tous remplis de valeurs différentes
 * les champs et méthodes statiques, partagés entre toutes les instances
 * seront les outils.
 * Nous pourrions découper notre code pour séparer ces 2 comportements
 * en crean par exemple deux classes 
 * Personne : comme avant uniquement avec les champs
 * PersonnesDAO : pour DataAccesObject qui s'occuperait des appels à la DB
 * pour ramener tout ce qui concerne les Personnes
 */
public class Personne {
	
	private static final String request_list = "SELECT * FROM personne WHERE 1";
	private int id;
	private String nom;
	private String prenom;
	private int age;
	
	private static AccessDB db;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		
		return  "-----------------\n"+
				"    id  :"+id+"\n"+
				"    nom :"+nom+"\n"+
				" prenom :"+prenom+"\n"+
				"    age :"+age+"\n";
		
	}
	public Personne(int id, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
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
		
		db.close();
		
		return listPersonne;
	}

	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db==null?new AccessDB():null);
		return  db.getConnection();
	}

}
