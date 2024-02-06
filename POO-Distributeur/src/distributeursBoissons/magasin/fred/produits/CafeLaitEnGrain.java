package distributeursBoissons.magasin.fred.produits;

public class CafeLaitEnGrain extends CafeLait implements ISGrain{
	

	public CafeLaitEnGrain(Double prix, String desc, String marque) {
		super(prix, desc, marque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String préparation() {
	 return	this.préparationGrain() + super.préparation();
	}
}
