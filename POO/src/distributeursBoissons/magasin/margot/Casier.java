package distributeursBoissons.magasin.margot;

import java.util.Stack;

import distributeursBoissons.magasin.SuperProduit;

public class Casier {

    Stack<Produit> leCasier;
    int tailleCasier;

    public Casier(int tailleCasier) {
        this.tailleCasier = tailleCasier;
        leCasier = new Stack<>();
    }

    public void ajouterDansCasier(SuperProduit produit) {
        // Si le casier a déjà sa taille maximum alors on ne le remplit pas
        if (leCasier.size() >= tailleCasier) {
            System.out.println("Ce casier est déjà plein");
            return;
        }
        leCasier.push((Produit) produit);
        System.out.println("Vous avez ajouté : " + produit.toString());

    }

    public Produit retirerDuCasier(Produit produit) {
        // Si le casier est déjà vide on ne peut rien retirer
        if (leCasier.isEmpty()) {
            System.out.println("Ce casier est vide");
            return null;
        }
        leCasier.pop();
        System.out.println("Vous avez retiré : " + produit.toString());
        return produit;
    }

    public Produit quelProduitEstStocker() {
        return leCasier.peek();
    }


}