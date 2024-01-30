package classeCouvert;

public class Main {

	public static void main(String[] args) {

		Couvert couv = new Couvert();
		couv.manger();
		
		Fourchette fourchette = new Fourchette();
		fourchette.manger();
		
		Couvert couv2 = new Fourchette();
		couv2.manger();
	}

}
