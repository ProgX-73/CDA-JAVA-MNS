package poo42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Licence {
	
	private int id;
	private String categ;
	private int prix;
	private boolean compet;
	private Personne detenteur;
	
	public Personne getDetenteur() {
		return detenteur;
	}
	public void setDetenteur(Personne detenteur) {
		this.detenteur = detenteur;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCateg() {
		return categ;
	}
	public void setCateg(String categ) {
		this.categ = categ;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public boolean isCompet() {
		return compet;
	}
	public void setCompet(boolean compet) {
		this.compet = compet;
	}
	public String toString() {
		
		return  "-----------------\n"+
				"    id  :"+id+"\n"+
				"    categ :"+categ+"\n"+
				" prix :"+prix+"\n"+
				"    opt compèt :"+compet+"\n";
		
	}
	public Licence(int id, String categ, int prix, boolean compet) {
		super();
		this.id = id;
		this.categ = categ;
		this.prix = prix;
		this.compet = compet;
	}
	

}
