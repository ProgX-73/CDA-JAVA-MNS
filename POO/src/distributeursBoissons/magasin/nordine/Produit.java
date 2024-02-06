package distributeursBoissons.magasin.nordine;
import java.util.HashMap;

import distributeursBoissons.magasin.SuperProduit;

public class Produit extends SuperProduit{


    public String nom;

    public Produit(String nom) {
        this.nom = nom;
    }
    
    public String getDesc() {
    	return nom+" "+this.getClass().getName();
    }
}
