package creational.singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() { }

    public synchronized static DoubleCheckedLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public String sayHello() {
        return "Hello from DoubleCheckedLockingSingleton!";
    }
}
