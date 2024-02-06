package distributeursBoissons.magasin;

import distributeursBoissons.magasin.fred.produits.Produit;

public interface IMagasin {
	
	public SuperProduit prendreProduit(String Rangee, int colonne);
	void remplirEmplacement(String Rangee, int colonne, SuperProduit p);

}
