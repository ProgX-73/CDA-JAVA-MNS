package alpinisme;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SommetAlpinisteDAO {
	private static AccessDB db;
	private static final String request_byAlpiniste = "SELECT * FROM SommetAlpiniste WHERE idAlpiniste=id_alp";
	private static final String request_byIds = "SELECT * FROM SommetAlpiniste WHERE idAlpiniste=id_alp and idSommet=id_s";
	private static final String request_list = "SELECT * FROM SommetAlpiniste WHERE 1";

	
	
	public static ArrayList<SommetAlpiniste> getByPersonne(Alpiniste alpiniste) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_byAlpiniste.replace("id_alp", "" + alpiniste.getId()));
		
		ArrayList<SommetAlpiniste> listeSommetAlpiniste = new ArrayList<SommetAlpiniste>();
		while (résultat.next()) {
			
			int idSommet = résultat.getInt(1);
			int annee = résultat.getInt(3);
			Sommets sommet = SommetDAO.get(idSommet);
			SommetAlpiniste pl = new SommetAlpiniste();
			pl.setAlpiniste(alpiniste);
			pl.setSommet(sommet);
			pl.setAnnee(annee);
			listeSommetAlpiniste.add(pl);
		}
		connection.close();

		return listeSommetAlpiniste;
	}
	
	public static SommetAlpiniste getByIds(Alpiniste alpiniste, Sommets sommet) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_byAlpiniste.replace("id_s", ""+sommet.getId()).replace("id_alp", "" + alpiniste.getId()));
		
		ArrayList<SommetAlpiniste> listeSommetAlpiniste = new ArrayList<SommetAlpiniste>();
		SommetAlpiniste pl = new SommetAlpiniste();
		while (résultat.next()) {
			int idSommet = résultat.getInt(1);
			int annee = résultat.getInt(3);
			pl.setAlpiniste(alpiniste);
			pl.setSommet(sommet);
			pl.setAnnee(annee);
		}
		connection.close();

		return pl;
	}
	
	public static ArrayList<SommetAlpiniste> list() throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_list);
		ArrayList<SommetAlpiniste> listSommetAlpiniste = new ArrayList<SommetAlpiniste>();
		while (résultat.next()) {
			SommetAlpiniste link = new SommetAlpiniste();
			link.setAlpiniste(AlpinisteDAO.get(résultat.getInt(2)));
			link.setSommet(SommetDAO.get(résultat.getInt(1)));
			link.setAnnee(résultat.getInt(3));
			listSommetAlpiniste.add(link);
		} // while

		connection.close();

		return listSommetAlpiniste;
	}
	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db == null ? new AccessDB() : db);
		return db.getConnection();
	}
}
