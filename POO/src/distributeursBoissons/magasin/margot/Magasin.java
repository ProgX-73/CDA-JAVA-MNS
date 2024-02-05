package distributeursBoissons.magasin.margot;

import java.util.ArrayList;

import distributeursBoissons.magasin.IMagasin;
import distributeursBoissons.magasin.SuperProduit;

public class Magasin implements IMagasin {

    ArrayList<ArrayList<Casier>> etagere = new ArrayList<>();


    public Magasin() {
        this.initialisationEtagere(2, 4);
        this.remplirMagazin();
    }

    private void remplirMagazin() {
        Produit cafe1 = new Produit("café", "Maxbien", "noir", "soluble");
        Produit cafe2 = new Produit("café", "Maxbien", "lait", "soluble");
        Produit cafe3 = new Produit("café", "Whatelse", "noir", "soluble");
        Produit cafe4 = new Produit("café", "Whatelse", "lait", "soluble");
        Produit cafeGrain1 = new Produit("café", "Lavatzo,", "noir", "grain");
        Produit cafeGrain2 = new Produit("café", "Lavatzo,", "lait", "grain");
        Produit lait = new Produit("lait", "Neness", "lait", "soluble");
        Produit chocolat = new Produit("chocolat chaud", "Neness", "chocolat", "soluble");

        this.remplirEmplacement("A", 0, cafe1);
        this.remplirEmplacement("A", 0, cafe1);
        this.remplirEmplacement("A", 0, cafe1);
        /* ATTENTION TU AS REMPLI l'emplacement avec 3 fois la même instance de produit */
        /*Si tu retires 1x le produit, l'emplacement est vide !*/
        
        this.remplirEmplacement("A", 1, cafe2);
        this.remplirEmplacement("A", 1, cafe2);
        this.remplirEmplacement("A", 1, cafe2);
        this.remplirEmplacement("A", 2, cafe3);
        this.remplirEmplacement("A", 2, cafe3);
        this.remplirEmplacement("A", 2, cafe3);
        this.remplirEmplacement("A", 3, cafe4);
        this.remplirEmplacement("A", 3, cafe4);
        this.remplirEmplacement("A", 3, cafe4);
        this.remplirEmplacement("B", 0, cafeGrain1);
        this.remplirEmplacement("B", 0, cafeGrain1);
        this.remplirEmplacement("B", 0, cafeGrain1);
        this.remplirEmplacement("B", 1, cafeGrain2);
        this.remplirEmplacement("B", 1, cafeGrain2);
        this.remplirEmplacement("B", 1, cafeGrain2);
        this.remplirEmplacement("B", 2, lait);
        this.remplirEmplacement("B", 2, lait);
        this.remplirEmplacement("B", 2, lait);
        this.remplirEmplacement("B", 3, chocolat);
        this.remplirEmplacement("B", 3, chocolat);
        this.remplirEmplacement("B", 3, chocolat);

        System.out.println("Le magasin est maintenant initialisé et remplit.");
    }

    private void initialisationEtagere(int nombreRange, int nombreColonne) {
        for (int i = 0; i < nombreRange; i++) {
            ArrayList<Casier> nouvelleRange = new ArrayList<>();
            for (int j = 0; j < nombreColonne; j++) {
                Casier leCasier = new Casier(3);
                nouvelleRange.add(leCasier);
            }
            etagere.add(nouvelleRange);
        }
    }

    private int rangeToInt(String range) {
        char A = 'A';
        range = range.toUpperCase();
        char charRange = range.charAt(0);

        return (int) charRange - (int) A;
    }

    @Override
    public void remplirEmplacement(String range, int colonne, SuperProduit produit) {
        int rangeInt = rangeToInt(range);
        etagere.get(rangeInt).get(colonne).ajouterDansCasier(produit);
    }

    @Override
    public SuperProduit prendreProduit(String range, int colonne) {
        int rangeInt = rangeToInt(range);
        Casier newCasier = etagere.get(rangeInt).get(colonne);
        Produit produit = newCasier.quelProduitEstStocker();
        return etagere.get(rangeInt).get(colonne).retirerDuCasier(produit);
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "etagere=" + etagere +
                '}';
    }


}