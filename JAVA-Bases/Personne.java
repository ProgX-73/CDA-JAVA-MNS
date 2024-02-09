package structures;

import java.util.ArrayList;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	
	private Personne pere;
	private Personne mere;
	private ArrayList<Personne> enfants = new ArrayList<Personne>();
	
	public Personne(String nom) {
		super();
		this.nom = nom;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public Personne getPere() {
		return pere;
	}


	public void setPere(Personne pere) {
		this.pere = pere;
	}


	public Personne getMere() {
		return mere;
	}


	public void setMere(Personne mere) {
		this.mere = mere;
	}


	public ArrayList<Personne> getEnfants() {
		return enfants;
	}


	public void setEnfants(ArrayList<Personne> enfants) {
		this.enfants = enfants;
	}
	
	
}
