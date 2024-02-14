package poo4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * DAO DataAccessObject Une classe dédiée à la manipulation des Personnes
 * Utilise l'objet AccessDB pour communiquer et lancer les requêtes vers la DB
 */
public class LicenceDAO {
	private static AccessDB db;
	private static final String request_list = "SELECT * FROM licence WHERE 1";
	private static final String request_getById = "SELECT * FROM licence WHERE id=id_licence";
	private static final String request_licence_by_personneId = "select l.* from personne p, licence l, personne_licence link where p.id=link.id_p and l.id=link.id_l and p.id=personneId";

	public static ArrayList<Licence> list() throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_list);
		ArrayList<Licence> listLicence = new ArrayList<Licence>();
		while (résultat.next()) {
			int iDLigne, prix;
			String categ;
			boolean compet;

			iDLigne = résultat.getInt(1);
			categ = résultat.getString(2);
			prix = résultat.getInt(3);
			compet = résultat.getBoolean(4);

			listLicence.add(
					new Licence(résultat.getInt(1), résultat.getString(2), résultat.getInt(3), résultat.getBoolean(4)));

		} // while

		connection.close();

		return listLicence;
	}

	public static Licence get(int id) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_getById.replace("id_licence", "" + id));
		ArrayList<Licence> listLicence = new ArrayList<Licence>();

		int iDLigne, prix;
		String categ;
		boolean compet;

		iDLigne = résultat.getInt(1);
		categ = résultat.getString(2);
		prix = résultat.getInt(3);
		compet = résultat.getBoolean(4);

		Licence licence = new Licence(résultat.getInt(1), résultat.getString(2), résultat.getInt(3),
				résultat.getBoolean(4));

		connection.close();

		return licence;
	}

	public static ArrayList<Licence> getByPersonneId(int personneId) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement
				.executeQuery(request_licence_by_personneId.replace("personneId", "" + personneId));
		ArrayList<Licence> licences = new ArrayList<Licence>();
		
		while(résultat.next()) {
			int iDLigne, prix;
			String categ;
			boolean compet;

			iDLigne = résultat.getInt(1);
			categ = résultat.getString(2);
			prix = résultat.getInt(3);
			compet = résultat.getBoolean(4);

			Licence licence = new Licence(résultat.getInt(1), résultat.getString(2), résultat.getInt(3),
					résultat.getBoolean(4));
			licences.add(licence);
			
			// sera clôturée par la methode appelante
		}
		connection.close();
		return licences;
	}
	
	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db==null?new AccessDB():db);
		return  db.getConnection();
	}
}
