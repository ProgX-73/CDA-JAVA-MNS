package poo32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * POJO
 * Une Classe représentant l'instance d'une ligne d'une table de la DB
 * "Normalement" la dénomination correspond bien sûr au nom de la table
 * (peut être plus compliqué pour des tables de liaisons)
 */
public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private int age;

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
	
	public String toString() {
		
		return  "-----------------\n"+
				"    id  :"+id+"\n"+
				"    nom :"+nom+"\n"+
				" prenom :"+prenom+"\n"+
				"    age :"+age+"\n";
		
	}
	public Personne(int id, String nom, String prenom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Personne() {
		super();
	}
	


}
