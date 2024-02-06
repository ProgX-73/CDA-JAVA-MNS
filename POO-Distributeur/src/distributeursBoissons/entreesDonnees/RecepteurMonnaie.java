package distributeursBoissons.entreesDonnees;

import java.util.Scanner;

public class RecepteurMonnaie {
	
	public Double saisieMontant() {
		 return Double.valueOf(new Scanner(System.in).next());
	}

}
