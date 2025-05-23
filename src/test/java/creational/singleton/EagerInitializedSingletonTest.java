package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EagerInitializedSingletonTest {

    @Test
    void testSingletonInstance() {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        assertSame(instance1, instance2);
        assertEquals("Hello from EagerInitializedSingleton!", instance1.sayHello());
    }
}
