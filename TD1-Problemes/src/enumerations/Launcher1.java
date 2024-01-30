package enumerations;

public class Launcher1 {
	
	enum Mois {janvier, février, mars, avril, mai, juin, juillet, août, septembre, octobre, novembre, décembre}
	
	public static void main(String[] args) {
		
		
		
		Mois mois = Mois.juillet;
		System.out.println(mois.ordinal());
		System.out.println(mois.values()[6]);

	}

}
