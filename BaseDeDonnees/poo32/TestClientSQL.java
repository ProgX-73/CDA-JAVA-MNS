package poo32;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Refactoring n°2
 * Alleger le main pour qu'il ne traite que des Personnes
 * D'ici la base de donnée est transparente.
 */
public class TestClientSQL {
	
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		
		Personne p = new Personne();
		p.setNom("Titi");
		p.setPrenom("Norbert");
		p.setAge(80);
		PersonneDAO.save(p);

		for (Personne personne : PersonneDAO.list()) {
					System.out.println(personne);
				}
				

			
	}
}
// main
