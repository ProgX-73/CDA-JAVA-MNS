package distributeursBoissons.magasin.fred.produits;

public class CafeNoirEnGrain extends CafeNoir implements ISGrain{
	

	public CafeNoirEnGrain(Double prix, String desc, String marque) {
		super(prix, desc, marque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String préparation() {
	 return	this.getClass().getName()+" : "+préparationGrain() + super.préparation();
	}
}
