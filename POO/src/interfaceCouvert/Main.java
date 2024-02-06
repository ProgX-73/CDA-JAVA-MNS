package interfaceCouvert;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		CarteDesPlats carte = new CarteDesPlats();
		
		Client toto = new Client();
		toto.plat = carte.get(1);
		System.out.println(toto.plat.couverts);
		toto.plat.couverts.get(0).manger();
		System.out.println(toto.plat.couverts.toString());
		
		Client titi = new Client();
		titi.plat = carte.get(2);
		System.out.println(titi.plat.couverts);
		titi.plat.couverts.get(0).manger();
		System.out.println(titi.plat.couverts.toString());
		
	
	}

}
