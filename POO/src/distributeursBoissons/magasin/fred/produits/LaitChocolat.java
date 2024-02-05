package distributeursBoissons.magasin.fred.produits;

public class LaitChocolat extends Lait {

	public LaitChocolat(Double prix, String desc, String marque) {
		super(prix, desc, marque);
		// TODO Auto-generated constructor stub
	}

	public String préparation() {
		return super.préparation() + " mélanger avec chocolat.";
	};
}
