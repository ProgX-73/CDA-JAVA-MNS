package distributeursBoissons.magasin.fred.produits;

public interface ISGrain {

	public default String préparationGrain() {
		return " moudre et passer au percolateur ";
	}
}
