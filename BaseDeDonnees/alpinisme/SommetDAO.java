package alpinisme;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * DAO DataAccessObject Une classe dédiée à la manipulation des Personnes
 * Utilise l'objet AccessDB pour communiquer et lancer les requêtes vers la DB
 */
public class SommetDAO {
	private static AccessDB db;
	private static final String request_list = "SELECT * FROM Sommets WHERE 1";
	private static final String request_getById = "SELECT * FROM Sommets WHERE id=ids";
	// private static final String request_licence_by_personneId = "select l.* from
	// personne p, licence l, personne_licence link where p.id=link.id_p and
	// l.id=link.id_l and p.id=personneId";

	public static ArrayList<Sommets> list() throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_list);
		ArrayList<Sommets> listLicence = new ArrayList<Sommets>();
		while (résultat.next()) {
			int iDLigne,alt;
			String nom, massif,pays;
			boolean compet;

			iDLigne = résultat.getInt(1);
			nom = résultat.getString(2);
			alt = résultat.getInt(3);
			massif = résultat.getString(4);
			pays = résultat.getString(5);

			listLicence.add(new Sommets(iDLigne,nom,alt,massif,pays));

		} // while

		connection.close();

		return listLicence;
	}

	public static Sommets get(int id) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_getById.replace("ids", "" + id));
		int iDLigne, alt;
		String nom,massif,pays;

		Sommets sommet = null;
		if (résultat.next()) {
			iDLigne = résultat.getInt(1);
			nom = résultat.getString(2);
			alt = résultat.getInt(3);
			massif = résultat.getString(4);
			pays = résultat.getString(5);

			sommet = new Sommets(iDLigne,nom,alt,massif,pays);
		}
		connection.close();

		return sommet;
	}

	public static ArrayList<Sommets> getByPersonne(Alpiniste personne) throws SQLException, ClassNotFoundException {
		ArrayList<SommetAlpiniste> listLink = SommetAlpinisteDAO.getByPersonne(personne);
		ArrayList<Sommets> resultat = new ArrayList<Sommets>();
		for (SommetAlpiniste pl : listLink) {
			resultat.add(pl.getSommet());
		}
		return resultat;
	}

	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db == null ? new AccessDB() : db);
		return db.getConnection();
	}
}
