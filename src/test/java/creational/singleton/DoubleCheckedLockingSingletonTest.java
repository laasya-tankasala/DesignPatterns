package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleCheckedLockingSingletonTest {

    @Test
    void testSingletonInstance() {
        DoubleLockingSingleton instance1 = DoubleLockingSingleton.getInstance();
        DoubleLockingSingleton instance2 = DoubleLockingSingleton.getInstance();
        assertSame(instance1, instance2);
        assertEquals("Hello from DoubleCheckedLockingSingleton!", instance1.sayHello());
    }
}
