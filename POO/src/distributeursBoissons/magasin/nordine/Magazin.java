package distributeursBoissons.magasin.nordine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import distributeursBoissons.magasin.IMagasin;
import distributeursBoissons.magasin.SuperProduit;

public class Magazin  implements IMagasin {




    private ArrayList<Produit> ListeCafe = new ArrayList<Produit>();
    private ArrayList<Produit> ListeLait = new ArrayList<Produit>();
    private ArrayList<Produit> ListeChoco = new ArrayList<Produit>();

    private static HashMap<String, ArrayList<Produit>> mapMagazin = new HashMap<String, ArrayList<Produit>>();


    public Magazin() {
		super();
		AjouterProduit();
		VoirInventaire();
	}

	public String SaisieLettre() {

        Scanner input = new Scanner(System.in);
        System.out.println("Quel est la lettre?");
        String z = input.nextLine();
        return z;

    }

    public Integer SaisieChiffre() {

        Scanner input = new Scanner(System.in);
        System.out.println("Quel est le chiffre?");
        Integer z = input.nextInt();
        return z;

    }

    public void AjouterProduit() {

        Produit cafe = new Cafe( "solubles");

        Produit lait = new Lait( "solubles");
        Produit lait2 = new Lait( "non solubles");
        Produit lait3 = new Lait( "poudre");
        Produit choco = new Choco( "solubles");
        Produit choco1 = new Choco( "non solubles");
        
        Produit choco2 = new Choco( "poudre");
        ListeCafe.add(cafe);

        ListeLait.add(lait);
        ListeLait.add(lait2);
        ListeLait.add(lait3);
        ListeChoco.add(choco);
        ListeChoco.add(choco1);
        ListeChoco.add(choco2);


        mapMagazin.put("A", ListeCafe);
        mapMagazin.put("B", ListeLait);
        mapMagazin.put("C", ListeChoco);



    }

    public void VoirInventaire() {
        System.out.println("Voici l'inventaire du ditributeurs:");
        System.out.println(mapMagazin);

    }



    public Produit Supprimer(Produit p) {
        ListeCafe.remove(p);
        ListeLait.remove(p);
        return p;
    }

    
    public Produit PrendreProduit(String lettre, Integer num) {
        Produit p = mapMagazin.get(lettre).get(num);
        return p;
        }



    
    public void remplirEmplacement() {
        Integer stockcafe = ListeCafe.size();
        Integer stocklait = ListeLait.size();
        if (stockcafe.equals(0)){
            System.out.println("Le produit est epuisee nous allons mettre du stock:");
            AjouterProduit();
        } else if (stocklait.equals(0)){
            System.out.println("Le produit est epuisee nous allons mettre du stock:");
            AjouterProduit();
        } else {
            System.out.println("il reste du stock");
        }
    }

	@Override
	public SuperProduit prendreProduit(String Rangee, int colonne) {
		return PrendreProduit(Rangee, colonne);
	}

	@Override
	public void remplirEmplacement(String Rangee, int colonne, SuperProduit p) {
		remplirEmplacement();
		
	}
}










