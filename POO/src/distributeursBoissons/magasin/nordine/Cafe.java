package distributeursBoissons.magasin.nordine;
public class Cafe extends Produit{


    public String type = "Café";

    @Override
    public String toString() {
        return "Cafe{" +
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

    public Cafe(String type) {
        super(type);


    }


}
