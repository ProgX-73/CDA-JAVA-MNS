package passageParametres;

public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		Integer b = 0;
		
		Data c = new Data();
		c.valeur = 0;
		String d = "A";
		
		augmente(a, b, c, d);
		
		System.out.println("valeur augmentées de a "+a);
		System.out.println("valeur augmentées de b "+b);
		System.out.println("valeur augmentées de c "+c.valeur);
		System.out.println("valeur augmentées de d "+d);
		System.out.println("valeur augmentées de d "+c.valeurString);
		
		a = changeValeur(a);
		System.out.println(a);
		
	}

	private static void augmente(int a, Integer b, Data c, String d) {
		a = a +1;
		b = b +1;
		c.valeur = c.valeur+1;
		c.valeurString = "B";
		d = "B";
	}
	
	private static int changeValeur( int a) {
		a = a +1;
	   return a;
	}
	

}
