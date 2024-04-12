package singleton;

public class Singleton3 {

    private static Singleton3 instance;
    private String data;

    public Singleton3(String data) {
        this.data=data;
    }

    public static Singleton3 getInstance(String data){

        //Threading ok
        //Mais file d'attente créée par la sych sur l'instance !
        //traitement freiné !
        //Double ckeck pour éviter
        //d'utiliser la synchronization dquand c'est inutile
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3(data);
                }
            }
        }
        return instance;

    }
}
