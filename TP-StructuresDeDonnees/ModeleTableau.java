package structuresDeDonnees;

import java.util.ArrayList;

public class ModeleTableau {

	public static void main(String[] args) {

		/*
		 * Modele à une dimension
		 */
		ArrayList<String> ligne;
		// ligne = null

		ligne = new ArrayList<String>();
		// Structure initialisée et vide, prète à l'emploi.

		// Remplissage
		ligne.add("chaine 1");
		ligne.add("chaine 2");
		ligne.add("chaine 3");
		//Chaque élément du tableau est un Objet String.
		
		// Je récupère un element (il n'est pas retiré de la liste)
		String monElement = ligne.get(2);
		System.out.println(monElement);

		// ligne.remove(2);
		// supprime un element de la liste.

		/*************************************************************************************************/
		/*
		 * Modele à deux dimensionx : Un tableau dans un tableau
		 */
		ArrayList<ArrayList<String>> colonne;
		// colonne = null

		colonne = new ArrayList<>();
		//pour être plus clair
		colonne = new ArrayList<ArrayList<String>>();
		//colonne peut maintenant être remplie par des tableaux de string.
		
		//J'y ajoute la ligne créée précédemment
		colonne.add(ligne);
		
		//Ajout d'une nouvelle ligne en plus
		ArrayList<String> ligne2 = new ArrayList<String>();
		colonne.add(ligne2);
		//je viens de mettre une ligne vide dans colonne en position 1
		
		/*
		 * LES ELEMENTS de mon objet colonne sont des tableaux de String
		 */
		
		//Ajout une troisième
		colonne.add(new ArrayList<String>());
		//ici la seule différences est que je n'est pas de "référence" sur la ligne(tableau) que je viens de créer.
		//c'est-à-dire : Une variable qui me permet de manipuler ce troisième element.
		
		//Cette 3ème "ligne" est en plus vide, je n'y ai mis aucun élément.
		//Voilà comment la remplir
		
		//Première écriture : je sais que la dernière 'ligne' inséré est la 3ème, et qu'une arrayList commence à 0 
		 ArrayList<String> ligne3 = colonne.get(2);
		 
		 //Je crée une variable ligne3 dans laquelle je "mets" le dernier element de l'objet colonne.
		 //Comme dit plus haut, cet élément n'est pas éffacé de l'objet colonne, il est just maintenant manipulable 
		 //grâce à mon objet ligne3
		 //***********On dit que ligne3 est une référence sur le troisième objet inséré dans colonne
		 //je l'utilise pour remplir ma ligne3<=> le troisième objet se trouvant dans colonne
		 ligne3.add("je suis élément1 de l'élément 3 de colonne");
		 ligne3.add("je suis élément2 de l'élément 3 de colonne");
		 ligne3.add("je suis élément3 de l'élément 3 de colonne");
		 
		 //Remplissons la ligne2 qu'on a laissé vide tout à l'heure
		//je peux utiliser la référence que j'ai gardé sur cette ligne : c'est mon objet ligne2
		 ligne2.add("je suis élément1 de l'élément 2 de colonne");
		 
		 //mais je peux aussi passer par mon objet colonne de cette manière
		 colonne.get(1).add("je suis élément2 de l'élément 2 de colonne");
		 colonne.get(1).add("je suis élément3 de l'élément 2 de colonne");
		 
		//attention à ne pas s'embrouiller avec le 0 !
		//l'element 1 de colonne est indicé 0 colonne.get(0) n'oubliez pas.
		 
		 
		 
		 /*
		  * Nous avons imbriqué des Tableaux dont l'élément final est un String.
		  * Il est bien sûr plus intéressant de penser que l'on y stocke un object d'une classe que l'on a crée soit même 
		  */
		
	}

}
