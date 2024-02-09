package structures;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {
		
		/*****************
		 * Une dimension
		 *****************/
			//Tableau entier 
			int[] tab;
			Integer[] tabInteger;
			
			//ArrayList
			ArrayList<Integer> iList;
			//ArrayList
			ArrayList<String> sList;
			//ArrayList
			ArrayList<Personne> pList;
			
			//Table de correspondance entre 2 OBJETS
			//Attention la colonne des clefs contient des valeur uniques
			HashMap<String, String> sMap = new HashMap<String, String>();
			HashMap<String, Personne> pMap = new HashMap<String, Personne>();
			HashMap<Personne, Personne> ppMap = new HashMap<Personne, Personne>();
		
		/*****************
		 * Deux dimensions
		 *****************/
			//Tableau entier 
			int[][] tab2;
			Integer[][] tab2Integer;
			
			//ArrayLists imbriquées
			ArrayList<ArrayList<Integer>> i2List = new ArrayList<ArrayList<Integer>>();
			//ArrayList
			ArrayList<ArrayList<String>> s2List;
			//ArrayList
			ArrayList<ArrayList<Personne>> p2List = new ArrayList<ArrayList<Personne>>();
			
			//Table de correspondance entre 2 OBJETS,le second est une Collection d'objets
			HashMap<String, ArrayList<Personne>> classCDA = new HashMap<String, ArrayList<Personne>>();
			//dessiner le shéma correspondant à cette structure.
			
			//Initialisation
			classCDA.put("cda", new ArrayList<Personne>());
			
			classCDA.get("cda").add(new Personne("Thomas"));
			classCDA.get("cda").add(new Personne("Ogtay"));
			classCDA.get("cda").add(new Personne("Abdel"));
			classCDA.get("cda").add(new Personne("Margot"));
			
			classCDA.put("tir à l'arc", new ArrayList<Personne>());
			classCDA.get("tir à l'arc").add(new Personne("Lilian"));
			classCDA.get("tir à l'arc").add(new Personne("Nicolas"));
			
			System.out.println(classCDA.get("cda").get(2).getNom());
			
			/*********************
			 * 
			 * Objets Imbriquées
			 * 
			 *********************/
			//regardez la classe Personne essayez de créer une petite famille.
			
			//Regarder la classe PoupeeRusse
			PoupeeRusse p1 = new PoupeeRusse(1, null);
			PoupeeRusse p2 = new PoupeeRusse(2, p1);
			PoupeeRusse p3 = new PoupeeRusse(3, p2);
			PoupeeRusse p4 = new PoupeeRusse(4, p3);
			
			System.out.println(p4.quisuije());
			
			
	}

}
