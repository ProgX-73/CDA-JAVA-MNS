import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex4 {

	/**
	 * 4. Mois : Découvrez les Classe Enum, HashSet
		Ecrire un programme qui lit le nombre entier entre 1
		et 12 passé en paramètre et qui affiche le nom du
		mois correspondant. On pourra utiliser un tableau ou
		l'instruction switch.. puis d’autres structures de données…
		
		Voir projet Objets utiles et courants
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String saisie;
		 int val;
		 do {
			 System.out.println("Entrer chiffre entre 1 et 12");
			 saisie = sc.next();
			 val = Integer.valueOf(saisie);
		 }
		 while(val<1||val>12);
		 
		 String[] mois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
		 System.out.println("Depuis le tab :"+mois[val-1]);
		 
		 
		 HashMap<Integer, String> mapMois = new HashMap<Integer, String>();
		 for(int i=1;i<13;i++) {
			 mapMois.put(i, mois[i-1]);
			 
		 }
		 System.out.println("depuis la map : "+mapMois.get(val));
		 
		 HashSet<String> setMois = new HashSet<String>(mapMois.values());
		 //System.out.println("depuis la map : "+setMois.
		 
	}

}
