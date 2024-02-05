package distributeursBoissons.magasin.fred.produits;

public interface ISoluble {

	public default String préparationSoluble() {
		return " ajouter eau chaude ";
	}
}
