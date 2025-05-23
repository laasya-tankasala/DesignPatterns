package creational.singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() { }

    public synchronized static SynchronizedSingleton getInstance() {
        if(instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    public String sayHello() {
        return "Hello from SynchronizedSingleton!";
    }
}