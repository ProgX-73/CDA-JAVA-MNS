package alpinisme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * client SQL réalisant une requête sur une base de données très simple
 * contenant une table
 */
public class TestClientSQL {
	
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		
				
				for (Alpiniste personne : AlpinisteDAO.list()) {
					System.out.println(personne);
				}
				
				/**
				 * Afficher la liste des sommets gravis et l'année
				 */
				System.out.println("**********************************");
				System.out.println("Mont\t\tAlpiniste\tAnnee");
				for(SommetAlpiniste links : SommetAlpinisteDAO.list()) {
					String ligne =links.getSommet().getNom()+(links.getSommet().getNom().length()<5?"\t":"")+"\t"+links.getAlpiniste().getNom()+"\t"+links.getAnnee();
					System.out.println(ligne);
				}
				
			
			
	}
}
// main
