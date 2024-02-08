package distributeursBoissons.magasin.hapsatou;

import java.util.HashMap;
import java.util.Map;

import distributeursBoissons.magasin.IMagasin;
import distributeursBoissons.magasin.SuperProduit;

public class Magasin implements IMagasin{
    private Map<Produit, Emplacement> inventaire;

    public Magasin() {
        inventaire = new HashMap<>();
        initialiserInventaire();
    }

    private void initialiserInventaire() {
        Produit p1 = new Produit("Maxbien", 0.99, 3);
        Produit p2 = new Produit("Whatelse", 1.49, 3);
        Produit p3 = new Produit("Choco Nesness", 0.99, 3);
        Produit p4 = new Produit("Lait Nesness", 1.49, 3);
        Produit p5 = new Produit("Noir Lavatzo", 1.49, 3);
        Produit p6 = new Produit("Lait Lavatzo", 0.99, 3);

        inventaire.put(p1, new Emplacement(1, "A", "A1"));
        inventaire.put(p2, new Emplacement(1, "B", "B1"));
        inventaire.put(p3, new Emplacement(2, "A", "A2"));
        inventaire.put(p4, new Emplacement(2, "B", "B2"));
        inventaire.put(p5, new Emplacement(3, "A", "A3"));
        inventaire.put(p6, new Emplacement(3, "B", "B3"));
    }

    public Produit rechercherProduitParNom(String nomProduit) {
        for (Produit produit : inventaire.keySet()) {
            if (produit.getNom().equals(nomProduit)) {
                return produit;
            }
        }
        return null;
    }

    public Emplacement getEmplacement(Produit produitRecherche) {
        return inventaire.get(produitRecherche);
    }

    public Produit rechercherProduitParEmplacement(Emplacement emplacementRecherche) {
        for (Map.Entry<Produit, Emplacement> entry : inventaire.entrySet()) {
            Produit produit = entry.getKey();
            Emplacement emplacement = entry.getValue();

            if (emplacementRecherche.getColonne() == emplacement.getColonne() &&
                    emplacementRecherche.getRangee().equals(emplacement.getRangee())) {
                return produit;
            }
        }
        return null;
    }

    public Produit rechercherProduitParPlace(String place) {
        boolean found = false;
        Produit produit = null;
        for (Map.Entry<Produit, Emplacement> entry : inventaire.entrySet()) {
            produit = entry.getKey();
            Emplacement emplacement = entry.getValue();
            if (place.equals(emplacement.getPlace())) {
                System.out.println("Produit trouvé : " + produit.getNom());
                System.out.println("Prix : " + produit.getPrix() + " euros");
                System.out.println("Emplacement : " + emplacement.getColonne() + emplacement.getRangee());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun produit n'est enregistré à l'emplacement " + place);
        }
        return produit;
    }
    

	@Override
	public SuperProduit prendreProduit(String Rangee, int colonne) {
	
    	Emplacement e = new Emplacement(colonne, Rangee, "");
    	Produit produit = this.rechercherProduitParEmplacement(e);
    	if(produit.getStock()==0)
    	{
    		produit.setDesc("LE PRODUIT EST EPUISE!");
    	}
    	else
    		produit.setStock(produit.getStock()-1);
		return produit;
	}

	@Override
	public void remplirEmplacement(String Rangee, int colonne, SuperProduit p) {
		// TODO Auto-generated method stub
		
	}
}