package structures;

public class PoupeeRusse {

	private int numPoupee = 0;
	
	private PoupeeRusse parent;

	public PoupeeRusse(int numPoupee, PoupeeRusse parent) {
		super();
		this.numPoupee = numPoupee;
		this.parent = parent;
	}
	
	public String quisuije() {
		String message = "je suis poupee n° "+numPoupee;
		if(parent!=null) {
			message += " \n mon parent : "+parent.quisuije();
		}
		else
			message += " Fin de la série ";
	
		return message;
	}
	
}
