package poo2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Un peu de ménage !
 * Refactoring n°1
 * Isoler tout ce qui concerne la base de donnée dans une classe dédiée.
 * la fabrique de la connexion AccessDB
 */
public class TestClientSQL {
	
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		
				AccessDB db = new AccessDB();
				ArrayList<Personne> résultat = db.RequestDb("SELECT * FROM personne WHERE 1");
					
				System.out.println("table des personnes : ");
				for (Personne personne : résultat) {
					System.out.println(personne);
				}
				
				
				db.close();
			
	}
}
// main
