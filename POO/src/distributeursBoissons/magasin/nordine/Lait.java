package distributeursBoissons.magasin.nordine;
public class Lait extends Produit  {


    public String type = "Lait";

    @Override
    public String toString() {
        return "Lait{" +
                "type='" + type + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Lait( String type) {
        super(type);

    }


}
