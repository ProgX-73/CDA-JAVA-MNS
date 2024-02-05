package distributeursBoissons;

import distributeursBoissons.entreesDonnees.PaveNumerique;
import distributeursBoissons.entreesDonnees.RecepteurMonnaie;
import distributeursBoissons.magasin.IMagasin;
import distributeursBoissons.magasin.SuperProduit;
import distributeursBoissons.magasin.fred.produits.Produit;
import distributeursBoissons.sortiesDonnees.CompartimentDelivrance;
import distributeursBoissons.sortiesDonnees.Ecran;

public class DistributeurBoissons {
	
	private RecepteurMonnaie recepteur = new RecepteurMonnaie();
	private PaveNumerique paveNumerique = new PaveNumerique();
	private Ecran ecran = new Ecran();
	private IMagasin magasin;
	private CompartimentDelivrance recipient = new CompartimentDelivrance();
	
	
	private Data data = new Data();
	private Double caisse = 0.0;
	
	private Data saisieData() {
		
		ecran.affiche("Introduire un montant : ");
		data.setSomme(recepteur.saisieMontant());
		ecran.affiche("Saisisez l'emplacement :");
		this.paveNumerique.saisieEmplacement(data);
		return data;
	}
	
	private boolean verifieData(Data data) {
		return true;
	}
	
	private SuperProduit prepare() {
		ecran.affiche("\tPréparation en cours...");
		SuperProduit produit = this.magasin.prendreProduit(data.getRangee(), data.getColonne());
		System.out.println("\t"+produit.préparation()+" "+produit.getDesc()+ " "+produit.getMarque());
		return produit;
	}
	
	private void delivre(SuperProduit superProduit) {
		
		this.recipient.setProduit(superProduit);
		ecran.affiche("Prélevez votre boisson.");
	}

	public void demarrage() {
		while(true) {
			this.data = saisieData();
			this.delivre(this.prepare());
		}
	}

	
	
	public void chargeMagasin(IMagasin mag) {
		this.magasin = mag;
	}
	
	
}
