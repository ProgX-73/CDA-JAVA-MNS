import java.util.ArrayList;
import java.util.HashMap;

public class Ex5 {
	
	public static void main(String[] args) {
		
		String langueChoisie = "EN";
		String nom = " Bob ";
		
		HashMap<String,String> tradFr= new HashMap<String,String>() ;
		tradFr.put("label1", "Bonjour");
		tradFr.put("label2", "Ravie de te rencontrer!");
		
		
		HashMap<String,String> tradEn= new HashMap<String,String>() ;
		tradEn.put("label1", "Hi,");
		tradEn.put("label2", "RNice to meet you!");
		
		
		HashMap<String,HashMap<String,String>> traducteur= new HashMap<String,HashMap<String,String>>() ;
		traducteur.put("FR", tradFr);
		traducteur.put("EN", tradEn);
		
		
		String phrase = 
				traducteur.get(langueChoisie).get("label1")
				+nom
				+traducteur.get(langueChoisie).get("label2");
		
		System.out.println(phrase);		
		
	}

}
