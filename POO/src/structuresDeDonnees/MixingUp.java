package structuresDeDonnees;

import java.util.ArrayList;
import java.util.HashMap;

public class MixingUp {

	public static void main(String[] args) {
	
		/**
		 * 	IMAGINEZ VOUS CES STRUCTURES 
		 */
		
		ArrayList<HashMap<String, String>> uneListeDeMap;
		HashMap<String, ArrayList<String>> uneMapDeListeDeString;
		
		HashMap<Robot, Tache> mapUneTachePourUnRobot;
		//pour retrouver une tâche je passe par un Robot
		Robot r1 = new Robot();
		r1.nom = "R2D2";
		
		Robot r2 = new Robot();
		r2.nom = "C3PO";
		
		Tache t1 = new Tache();
		t1.nom = "Traduction";
		
		Tache t2 = new Tache();
		t2.nom = "Navigation";
		
		//Initialiser ma structure 
		mapUneTachePourUnRobot = new HashMap<Robot, Tache>();
		//remplir
		mapUneTachePourUnRobot.put(r1, t2);
		mapUneTachePourUnRobot.put(r2, t1);
		
		//recuperer une reference sur une tache
		Tache tacheR2D2 = mapUneTachePourUnRobot.get(r2);
		System.out.println(tacheR2D2.nom);
		
		
		/***
		 * 
		 * MELANGER, CREER, IMBRIQUER EN FONCTION DU MODELE
		 * 
		 * Des map de tableaux, de tableau de map tout est possible.
		 * gardez seulement en tête le schema de base des structures, apprenez à les combiner.
		 */
		
		/* DECOUVREZ L'OBJET Stack de JAVA
		 * 
		 * 1/Lisez une doc
		 * 2/Appropriez vous l'objet
		 * 3/Creer votre propre Stack par héritage
		 * 4/creer un tableau de Stack
		 * 5/creer une hashmap de tableaux de stack 
		 */
	}

}
