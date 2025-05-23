package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SynchronizedSingletonTest {

    @Test
    void testSingletonInstance() {
        SynchronizedSingleton instance1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton instance2 = SynchronizedSingleton.getInstance();
        assertSame(instance1, instance2);
        assertEquals("Hello from SynchronizedSingleton!", instance1.sayHello());
    }
}

