package singleton;

public class Singleton1 {

    private static Singleton1 instance;
    private String data;

    public Singleton1(String data) {
        this.data=data;
    }

    public static Singleton1 getInstance(String data){
        if(instance==null){
            instance = new Singleton1(data);
        }
        return instance;

    }
}
