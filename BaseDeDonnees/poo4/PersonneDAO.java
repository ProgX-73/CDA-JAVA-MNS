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
public class PersonneDAO {
	private static AccessDB db;
	private static final String request_list = "SELECT * FROM personne WHERE 1";

	public static ArrayList<Personne> list() throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_list);
		ArrayList<Personne> listPersonne = new ArrayList<Personne>();
		while (résultat.next()) {
			int iDLigne, age;
			String name, forename;

			iDLigne = résultat.getInt(1);
			name = résultat.getString(2);
			forename = résultat.getString(3);
			age = résultat.getInt(4);
			Personne p = new Personne(résultat.getInt(1), résultat.getString(2), résultat.getString(3),
					résultat.getInt(4));
			p.setLicence(LicenceDAO.getByPersonneId(p.getId()));
			listPersonne.add(p);

		} // while

		connection.close();

		return listPersonne;
	}

	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db == null ? new AccessDB() : db);
		return db.getConnection();
	}
}
