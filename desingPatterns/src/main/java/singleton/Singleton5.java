package singleton;

public class Singleton5 {

    private static volatile Singleton5 instance;
    private String data;

    public Singleton5(String data) {
        this.data=data;
    }

    public static Singleton5 getInstance(String data){

        //Threading ok
        //Synchronization économisée ok
        //Init partielle=> Volatile OK
        //Variable locale (acc jusqu'à 40% l'accès !)
        if (instance == null) {
            synchronized (Singleton5.class) {
                Singleton5 result = instance;
                if (result == null) {
                    instance = result = new Singleton5(data);
                }
            }
        }
        return instance;

    }
}
