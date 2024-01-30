import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	/**
	 * 3. Minimum, maximum et somme : ArrayList ou int[]
		Ecrire un programme qui saisie N entiers en arguments
		de ligne de commande, les insère dans un tableau, puis
		calcule et affiche le minimum, le maximum, la moyenne,
		et la somme de ces nombres. Ecrire une variante en
		donnant seulement N en argument de ligne, et en
		insérant les N entier à partir du programme.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		if(args.length>0) {
			int longueur = Integer.valueOf(args[0]);
			//avec un tableau non dynamique
			int[] tab = new int[Integer.valueOf(longueur)];
			
			int i = 0;
			System.out.println("Entrez "+longueur+" valeurs.");
			while(i<tab.length) {
				String value = sc.next();
				tab[i]=Integer.valueOf(value);
				i++;
				
			}
			int min = tab[0];
			int max = tab[0];
			int somme = tab[0];
			
			for(i=1;i<tab.length;i++) {
				max=tab[i]>max?tab[i]:max;
				min=tab[i]<min?tab[i]:min;
				somme+=tab[i];
			}
			double moy = Double.valueOf(somme)/Double.valueOf(longueur);
			System.out.println("max: "+max+"\n min: "+min+"\n moy:"+moy+"   "+somme);
			System.out.println(19/4);
			
		}
		else
		{
			System.out.println("Entrez des valeurs, une valeur vide termine la saisie.");
			String value = sc.next();
			ArrayList<Integer>tab = new ArrayList<Integer>();
			while(!value.equals("s")) {
				tab.add(Integer.valueOf(value));
				value = sc.next();
			}
			
			int min = tab.get(0);
			int max = tab.get(0);
			int somme = 0;
			for(Integer val:tab) {
				max=val>max?val:max;
				min=val<min?val:min;
				somme+=val;
			}
			double moy = Double.valueOf(somme)/Double.valueOf(tab.size());
			System.out.println("max: "+max+"\n min: "+min+"\n moy:"+moy+"   "+somme);
			System.out.println(19/4);
		}
		

		
	}

}
