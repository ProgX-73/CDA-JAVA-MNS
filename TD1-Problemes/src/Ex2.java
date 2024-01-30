
public class Ex2 {

	/*
	 * 2. Compter de 5 en 5
		Ecrire un programme qui compte de 5 en 5 de 0 jusqu'à 100 puis affiche la somme des 
		nombres trouvés.
		Ecrire deux versions : l'une utilisant une boucle FOR et l'autre utilisant une boucle WHILE. 
		Donner le temps d’exécution en ms pour une valeur final=500 puis 1000. Utiliser la méthode
		System.currentTimeMillis() qui retourne un type long (nbr de ms
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int somme = 0;
		for(int i=0;i<101;i+=5) {
			System.out.println(i);
			somme+=i;
			System.out.println(somme);
		}
		
	}

}
