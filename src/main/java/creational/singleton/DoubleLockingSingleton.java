package creational.singleton;

public class DoubleLockingSingleton {

    private static volatile DoubleLockingSingleton instance;

    private DoubleLockingSingleton() { }

    public synchronized static DoubleLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public String sayHello() {
        return "Hello from DoubleCheckedLockingSingleton!";
    }
}
