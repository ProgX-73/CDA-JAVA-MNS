package distributeursBoissons.magasin.hapsatou;

import distributeursBoissons.magasin.SuperProduit;

public class Produit extends SuperProduit{
    private String nom;
    private int stock;

    public Produit(String nom, double prix, int stock) {
       this.setPrix(prix);
       this.nom=nom;
       this.setDesc(nom);
       this.stock=stock;
    }

    public String getNom() {
        return nom;
    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}