package enumerations;
import java.util.EnumSet;

public class Launcher2 {

	public static void main(String[] args) {
		 Civilite civilite = Civilite.MADEMOISELLE ;
		 System.out.println("Civilite : " + civilite + " [" + civilite.getAbreviation() + "]") ;
		 
		 EnumSet<Civilite> enumSet = EnumSet.allOf(Civilite.class) ;
		
		
	}
}
