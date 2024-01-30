

import java.util.HashSet;

public class Launcher3 {
	public static void main(String[] args) {

		// create a HashSet of Strings
		HashSet<String> hs = new HashSet<String>();

		// Add elements using the add() method
		hs.add("Collin");
		hs.add("Bob");
		hs.add("Abigail");

		// Duplicates will ignored; this statement is useless
		hs.add("Collin");

		System.out.println(hs);
		System.out.println("Bob is in the set (T/F): " + hs.contains("Bob"));
		System.out.println("Max is in the set (T/F): " + hs.contains("Max"));

	}
}