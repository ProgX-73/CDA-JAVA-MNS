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
public class AlpinisteDAO {
	private static AccessDB db;
	private static final String request_list = "SELECT * FROM Alpiniste WHERE 1";
	private static final String request_getById = "SELECT * FROM Alpiniste WHERE id=ids";

	public static ArrayList<Alpiniste> list() throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_list);
		ArrayList<Alpiniste> listPersonne = new ArrayList<Alpiniste>();
		while (résultat.next()) {
			int iDLigne;
			String nom,prenom,nationalite;

			nom = résultat.getString(1);
			prenom = résultat.getString(2);
			nationalite = résultat.getString(3);
			iDLigne = résultat.getInt(4);
			Alpiniste alp = new Alpiniste(iDLigne,nom,prenom,nationalite);
			alp.setSommetsGravis(SommetDAO.getByPersonne(alp));
			listPersonne.add(alp);

		} // while

		connection.close();

		return listPersonne;
	}

	public static Alpiniste get(int id) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_getById.replace("ids", "" + id));

		Alpiniste alp = null;
		if (résultat.next()) {
			int iDLigne;
			String nom,prenom,nationalite;

			nom = résultat.getString(1);
			prenom = résultat.getString(2);
			nationalite = résultat.getString(3);
			iDLigne = résultat.getInt(4);
			alp = new Alpiniste(iDLigne,nom,prenom,nationalite);
			alp.setSommetsGravis(SommetDAO.getByPersonne(alp));
		}
		connection.close();

		return alp;
	}
	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db == null ? new AccessDB() : db);
		return db.getConnection();
	}
}
