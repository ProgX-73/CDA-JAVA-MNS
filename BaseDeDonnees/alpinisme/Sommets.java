package alpinisme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Sommets {
	
	private int idSommet;
	private String nom;
	private int altitude;
	private String massif;
	private String pays;
	
	
	
	public Sommets(int id, String nom, int alt, String massif, String pays) {
		this.idSommet = id;
		this.nom = nom;
		this.altitude = alt;
		this.massif = massif;
		this.pays = pays;
	}
	public int getId() {
		return idSommet;
	}
	public void setId(int id) {
		this.idSommet = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public String getMassif() {
		return massif;
	}
	public void setMassif(String massif) {
		this.massif = massif;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public String toString() {
		String str = "Sommet :"+this.nom+ "@"+this.altitude+"m "+this.massif+" "+this.pays;
		return str;
	}
	
	
}
