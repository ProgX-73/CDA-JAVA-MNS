package passageParametres;

public class Exemple2 {
	
	public static void main(String[] args) {
		
		int[] tab = new int[3];
		tab[0] = 0;
		tab[1] = 1;
		
		changeTab(tab, tab[1]);
		
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);
		
	}

	private static void changeTab(int[] tab, int valeur) {
		tab[0]=10;
		valeur = 100;
		tab[2]=1000;
	}

}
