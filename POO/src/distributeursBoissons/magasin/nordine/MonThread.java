package distributeursBoissons.magasin.nordine;
public class MonThread implements Runnable {

	/*
	 * 
	 * Ca sert à rien mais C'est FUN !!!!
	 * Bien joué ;)
	 */

    @Override
    public void run( ) {
        try {
            System.out.println("Prend gobelet\n");
            Thread.sleep(10000);
            System.out.println("Verse Produit Soluble dans gobelet\n");
            Thread.sleep(10000);
            System.out.println("Verse l’eau chaude\n");
            Thread.sleep(10000);
            System.out.println("Dépose dans le Compartiment de Délivrance\n");
            Thread.sleep(10000);
            System.out.println("Produit pret\n");

        } catch (InterruptedException ie) {
            System.out.println("Probleme machine");
        }

    }


}
