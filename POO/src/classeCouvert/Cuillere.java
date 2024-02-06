package classeCouvert;

public class Cuillere extends  Couvert {

	public void pelleter() {
		System.out.println(" ramasse le matériau avec le creux de pelle.");
	}
	
	@Override
	public void manger() {
		this.pelleter();

	}

}
