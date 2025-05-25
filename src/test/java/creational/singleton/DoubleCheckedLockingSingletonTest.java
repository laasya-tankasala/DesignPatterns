package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class DoubleCheckedLockingSingletonTest {

    @Test
    void testSingletonInstance() {
        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton instance2 = DoubleCheckedLockingSingleton.getInstance();
        assertSame(instance1, instance2);
        assertEquals("Hello from DoubleCheckedLockingSingleton!", instance1.sayHello());
    }
}
