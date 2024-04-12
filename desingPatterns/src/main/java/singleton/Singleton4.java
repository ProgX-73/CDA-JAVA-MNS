package singleton;

public class Singleton4 {

    private static volatile Singleton4 instance;
    private String data;

    public Singleton4(String data) {
        this.data=data;
    }

    public static Singleton4 getInstance(String data){

        //Threading ok
        //Synchronization économisée ok
        //Mais à la compilation,certain langage référence un objet partiellement initialisé !
        //==>th1 avec, voit null, lock et initialisation en cours
        //th2 arrive pendant l'init et ne voit déjà plus null pour l'instance !!
        //il saut l'initialisation et récupère un objet incomplet (si l'init est longue)
        //emploi de Volatile sur le champ instance pour éviter cela
        //empêche la mise en cache de l'objet partiel en forçant une lecture synchro sur la mémoire principale
        //OK ca marche mais on peut encore faire mieux en perf car on lit 2 fois l'instance maintenant et
        //lu en mémoire centrale donc accès long !
        //1x au if null,1 x au return
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4(data);
                }
            }
        }
        return instance;

    }
}
