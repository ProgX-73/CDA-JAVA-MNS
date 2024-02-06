package distributeursBoissons.magasin;

public class SuperProduit {
	
	private Double prix;
	private String desc;
	private String marque;
	
	
	public String préparation() {
		//triche ou astuce pour l'ordre d'affichage
		return "";
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	};
	
	
}
