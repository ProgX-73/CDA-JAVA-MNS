package distributeursBoissons.magasin.nordine;
public class Choco extends Produit{
    public String type;

    public Choco(String type) {
//        super(type);
//        Quand tu fais ça, ça appelle le constructeur de Produit avec la valeur de ton type 
//        donc ton Chocolat aura le "NOM" = Soluble ou non soluble
    	
    	super("Chocolat");
    	this.type = type;
    	/* Je pense que tu voulais obtenir ça plutôt !
    	 * Ici on appelle le cpnstructeru de Produit avec la valeur chocolat pour le nom
    	 * On met le type du chocolat avec la valeur du paramète passé au constructeur de Chocolat
    	 */
    }

    @Override
    public String toString() {
        return "Choco{" +
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
}
