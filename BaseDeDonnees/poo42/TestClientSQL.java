package poo42;
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
		
				
				for (Personne personne : PersonneDAO.list()) {
					System.out.println(personne);
				}
				
				
			
			
	}
}
// main
