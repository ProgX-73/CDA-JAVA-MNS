package distributeursBoissons.magasin.fred.produits;

import distributeursBoissons.magasin.SuperProduit;

public abstract class Produit extends SuperProduit{
	
	private Double prix;
	private String desc;
	private String marque;
	
	
	public Produit(Double prix, String desc, String marque) {
		super();
		this.prix = prix;
		this.desc = desc;
		this.marque = marque;
	}

	public String préparation() {
		//triche ou astuce pour l'ordre d'affichage
		return "Verser dans gobelet";
	};

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
	}
	
	
}
