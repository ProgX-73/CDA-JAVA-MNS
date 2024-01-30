package interfaceCouvert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CarteDesPlats extends ArrayList<Plat> {

	public CarteDesPlats() {
		super();
		//En fonction du plat je choisi les couverts
				ArrayList<Couvert> couvertsPate = new ArrayList<Couvert>();
				Collections.addAll(couvertsPate, new Cuillere(), new Fourchette());
				Plat pastaDuJour = new Plat("Carbonara", couvertsPate);
				//couvertsPate.add(new Fourche()); impossible
				
				ArrayList<Couvert> couvertsSoupe = new ArrayList<Couvert>();
				Collections.addAll(couvertsSoupe, new Cuillere());
				Plat soupeDuJour = new Plat("Soupe oignons", couvertsSoupe);
				
				ArrayList<Couvert> couvertsBurger = new ArrayList<Couvert>();
				Collections.addAll(couvertsBurger, new Fourchette(), new Couteau());
				Plat burgerDuJour = new Plat("CheeseBurger", couvertsBurger);
				
				Collections.addAll(this,pastaDuJour,soupeDuJour,burgerDuJour);
	}


}
