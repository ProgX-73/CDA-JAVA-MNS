package classeCouvert;

public class Couteau extends Couvert {

	public void scier() {
		System.out.println(" use le matériau avec les dents de scie.");
	}
	
	public void manger() {
		this.scier();
	}

}
