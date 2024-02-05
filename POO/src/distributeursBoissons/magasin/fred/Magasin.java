package distributeursBoissons.magasin.fred;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import distributeursBoissons.magasin.IMagasin;
import distributeursBoissons.magasin.SuperProduit;
import distributeursBoissons.magasin.fred.produits.CafeLaitEnGrain;
import distributeursBoissons.magasin.fred.produits.CafeNoirEnGrain;
import distributeursBoissons.magasin.fred.produits.CafeNoirSoluble;
import distributeursBoissons.magasin.fred.produits.Lait;
import distributeursBoissons.magasin.fred.produits.LaitChocolat;
import distributeursBoissons.magasin.fred.produits.Produit;

public class Magasin extends HashMap<String, ArrayList<Stack<Produit>>> implements IMagasin {
	

	
	public Magasin() {
		this.put("A",new ArrayList<Stack<Produit>>());
		this.put("B",new ArrayList<Stack<Produit>>());
		
		this.get("A").add(new Stack<Produit>());
		this.get("A").add(new Stack<Produit>());
		this.get("A").add(new Stack<Produit>());
		this.get("A").add(new Stack<Produit>());
		
		this.get("B").add(new Stack<Produit>());
		this.get("B").add(new Stack<Produit>());
		this.get("B").add(new Stack<Produit>());
		this.get("B").add(new Stack<Produit>());
		initialiseProduits();
	}

	private void initialiseProduits() {
		remplirEmplacement("A",1, new CafeNoirEnGrain(3.0,"Café Noir Grain","Lavatzo"));
		remplirEmplacement("A",1, new CafeNoirEnGrain(3.0,"Café Noir Grain","Lavatzo"));
		remplirEmplacement("A",1, new CafeNoirEnGrain(3.0,"Café Noir Grain","Lavatzo"));
		
		remplirEmplacement("A",2, new CafeLaitEnGrain(3.0,"Café Lait Grain","Lavatzo"));
		remplirEmplacement("A",2, new CafeLaitEnGrain(3.0,"Café Lait Grain","Lavatzo"));
		remplirEmplacement("A",2, new CafeLaitEnGrain(3.0,"Café Lait Grain","Lavatzo"));
		
		remplirEmplacement("A",3, new CafeNoirSoluble(2.0,"Café Noir Soluble","Maxbien"));
		remplirEmplacement("A",3, new CafeNoirSoluble(2.0,"Café Noir Soluble","Maxbien"));
		remplirEmplacement("A",3, new CafeNoirSoluble(2.0,"Café Noir Soluble","Maxbien"));
		
		remplirEmplacement("B",1, new LaitChocolat(2.0,"Chocolat","Neness"));
		remplirEmplacement("B",1, new LaitChocolat(2.0,"Chocolat","Neness"));
		remplirEmplacement("B",1, new LaitChocolat(2.0,"Chocolat","Neness"));
		
		remplirEmplacement("B",2, new Lait(2.0,"Chocolat","Neness"));
		remplirEmplacement("B",2, new Lait(2.0,"Chocolat","Neness"));
		remplirEmplacement("B",2, new Lait(2.0,"Chocolat","Neness"));
		
		remplirEmplacement("B",3, new CafeNoirSoluble(2.2,"Café Noir Soluble","Whatelse"));
		remplirEmplacement("B",3, new CafeNoirSoluble(2.2,"Café Noir Soluble","Whatelse"));
		remplirEmplacement("B",3, new CafeNoirSoluble(2.2,"Café Noir Soluble","Whatelse"));
		
		
		System.out.println("OK magasin initialisé.");
		
	}

	@Override
	public void remplirEmplacement(String Rangee, int colonne, SuperProduit p) {
		this.get(Rangee).get(colonne-1).push((Produit) p);
	}

	@Override
	public Produit prendreProduit(String Rangee, int colonne) {
		// TODO Auto-generated method stub
		return this.get(Rangee).get(colonne-1).pop();
	}

}
