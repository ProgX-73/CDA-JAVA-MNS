package distributeursBoissons.entreesDonnees;

import java.util.Scanner;

import distributeursBoissons.Data;

public class PaveNumerique {

	private Scanner scanner = new Scanner(System.in);
	
	//Passage de parametres par référence car objet
	public void saisieEmplacement(Data data) {
		String rangee = scanner.next();
		data.setRangee(rangee);
		int col = scanner.nextInt();
		data.setColonne(col);
		
	}

 

}
