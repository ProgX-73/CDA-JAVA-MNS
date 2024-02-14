package poo42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Regroupe uniquement le code correspondant à la connection
 * physique à la DB
 */
public class AccessDB {

	private String  driver; 
	private String  url;
	private String  user;
	private String  password;
	
	public AccessDB() throws ClassNotFoundException, SQLException {
		super();
		driver = "com.mysql.cj.jdbc.Driver"; 		// classe constituant le driver 
		//pour mySQL
		//driver  = "sun.jdbc.odbc.JdbcOdbcDriver";     //pour un SGBD suivant le protocole ODBC
		url = "jdbc:mysql://localhost/velo";
		user = "root";
		password = "root";
		
		Class.forName(driver); // en cas d'échec  : throws ClassNotFoundException
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	
}
