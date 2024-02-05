package distributeursBoissons.magasin.margot;

import distributeursBoissons.magasin.SuperProduit;

public class Produit extends SuperProduit{

    private final String type;
    private final String marque;
    private final String gout;
    private final String typeDosette;

    public Produit(String type, String marque, String gout, String typeDosette) {
        this.type = type;
        this.marque = marque;
        this.gout = gout;
        this.typeDosette = typeDosette;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "type='" + type + '\'' +
                ", marque='" + marque + '\'' +
                ", gout='" + gout + '\'' +
                ", typeDosette='" + typeDosette + '\'' +
                '}';
    }
}