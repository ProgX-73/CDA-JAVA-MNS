package structuresDeDonnees;

import java.util.HashMap;

public class ModeleHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> trad = new HashMap<String, String>();
		//représentez vous cette structure sur papier
		//deux colonnes, de la première je récupère la valeur à la seconde comme un dictionnaire de String
		
		trad.put("Bonjour", "Hello");
		trad.put("Bien joué!", "Well done!");
		
		System.out.println(trad.get("Bonjour"));

		//Je peux imaginer combiner cette hashMap, avec une seconde comme les tableaux
		HashMap<String, HashMap<String, String>> langue = new HashMap<String,HashMap<String, String>>();
		//ici j'ai une association entre un String et une HashMap mais tout est vide.
		
		langue.put("EN", trad);
		//je peux même récupérer ma hashmap nommée trad dans une nouvelle "référence" ou variable (pas d'intérêt)
		HashMap<String, String> nouvelleReference = langue.get("EN");
		//nouvelleReference et trad sont deux référence au même objet (le nom de la variable est la référence)
		//si je modifie l'un l'autre l'est aussi
		nouvelleReference.put("Voiture", "Car");
		
		System.out.println(trad.get("Voiture"));
		System.out.println(langue.get("EN").get("Voiture"));
		
		/**
		 * ALLEZ VOIR LE CODE DE L'OBJET TRADUCTEUR
		 * Voyez comment il simplifie la vision de la strucure de donnée précédente 
		 */
		
		HashMap<String, Traducteur> lang2 = new HashMap<String, Traducteur>();
		lang2.put("EN", new Traducteur());
		//Attention cependant ici mon objet traducteur est vide
		
		/**
		 * Si je fait la même chose avec Langue
		 * Voyez le code de Langue
		 */
		Langue lang3 = new Langue();
		lang3.put("EN",new Traducteur());
		//insersion d'élément
		lang3.get("EN").put("Aïe!", "Ouch!");
		//LES STRUCTURE SONT EQUIVALENTES
		
	}

}
