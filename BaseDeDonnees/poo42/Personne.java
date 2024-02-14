package poo42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Personne {
	
	private static final String request_list = "SELECT * FROM personne WHERE 1";
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private ArrayList<Licence> licences;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public ArrayList<Licence> getLicences() {
		return licences;
	}
	public void setLicence(ArrayList<Licence> licences) {
		this.licences = licences;
	}
	public String toString() {
		String strLicence = "";
		if(licences!=null)
			strLicence="-------->>>>>> Licence : "+licences.toString();
		
		return  "-----------------\n"+
				"    id  :"+id+"\n"+
				"    nom :"+nom+"\n"+
				" prenom :"+prenom+"\n"+
				"    age :"+age+"\n"+
				strLicence;
		
	}
	public Personne(int id, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
}
