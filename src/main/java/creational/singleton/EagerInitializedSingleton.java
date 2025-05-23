package creational.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() { }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public String sayHello() {
        return "Hello from EagerInitializedSingleton!";
    }
}
