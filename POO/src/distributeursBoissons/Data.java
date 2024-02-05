package distributeursBoissons;

public class Data {
	
	//public static enum Rangee {A, B, C}
	private Double somme;
	private String rangee;
	private int colonne;
	
	
	public Data(Double somme, String rangee, int colonne) {
		super();
		this.somme = somme;
		this.rangee = rangee;
		this.colonne = colonne;
	}
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public Double getSomme() {
		return somme;
	}
	public void setSomme(Double somme) {
		this.somme = somme;
	}
	
	public String getRangee() {
		return rangee;
	}
	public void setRangee(String rangee) {
		this.rangee = rangee;
	}
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	
	
}
