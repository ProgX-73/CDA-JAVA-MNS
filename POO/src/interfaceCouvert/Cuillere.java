package interfaceCouvert;

public class Cuillere extends Pelle implements Couvert {

	@Override
	public void manger() {
		this.pelleter();

	}

	public String toString() {
		System.out.println("ici la cuillère.");
		return this.getClass().getName();
	}
}
