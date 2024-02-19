package alpinisme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Alpiniste {
	
	private static final String request_list = "SELECT * FROM personne WHERE 1";
	private int idAlpiniste;
	private String nom;
	private String prenom;
	private String nationalite;
	private ArrayList<Sommets> sommetsGravis;
	
	private static AccessDB db;
	private static boolean fetchAll = true; 
	public Integer getId() {
		return idAlpiniste;
	}
	public void setId(Integer id) {
		this.idAlpiniste = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	
	public ArrayList<Sommets> getSommetsGravis() {
		return sommetsGravis;
	}
	public void setSommetsGravis(ArrayList<Sommets> sommetsGravis) {
		this.sommetsGravis = sommetsGravis;
	}
	public String toString() {
		return  "-----------------\n"+
				"    id  :"+idAlpiniste+"\n"+
				"    nom :"+nom+"\n"+
				" prenom :"+prenom+"\n"+
				"     nationalite :"+nationalite+"\n"+
				sommetsGravis;
		
	}
	public Alpiniste(int id, String nom, String prenom, String nationalite) {
		super();
		this.idAlpiniste = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
	}
}
