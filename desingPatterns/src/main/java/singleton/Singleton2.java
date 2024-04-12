package singleton;

public class Singleton2 {

    private static Singleton2 instance;
    private String data;

    public Singleton2(String data) {
        this.data=data;
    }

    public static Singleton2 getInstance(String data){

        //Threading ok
        synchronized (Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2(data);
            }
        }
        return instance;

    }
}
