package distributeursBoissons.magasin.fred.produits;

public class CafeNoirSoluble extends CafeNoir implements ISoluble {

	public CafeNoirSoluble(Double prix, String desc, String marque) {
		super(prix, desc, marque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String préparation() {
	 return	super.préparation() + this.préparationSoluble();
	}

}
