package poo42;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonneLicenceDAO {
	private static AccessDB db;
	private static final String request_byPersonne = "SELECT * FROM personne_licence WHERE id_p=id_personne";
	
	
	
	public static ArrayList<PersonneLicence> getByPersonne(Personne personne) throws SQLException, ClassNotFoundException {

		Connection connection = connectDB();
		Statement statement = connection.createStatement();
		ResultSet résultat = statement.executeQuery(request_byPersonne.replace("id_personne", "" + personne.getId()));
		
		ArrayList<PersonneLicence> listPersonneLicence = new ArrayList<PersonneLicence>();
		while (résultat.next()) {
			
			int idLicence = résultat.getInt(1);
			Licence licence = LicenceDAO.get(idLicence);
			PersonneLicence pl = new PersonneLicence();
			pl.setPersonne(personne);
			pl.setLicence(licence);
			listPersonneLicence.add(pl);
		}
		connection.close();

		return listPersonneLicence;
	}
	
	static Connection connectDB() throws ClassNotFoundException, SQLException {
		db = (db == null ? new AccessDB() : db);
		return db.getConnection();
	}
}
