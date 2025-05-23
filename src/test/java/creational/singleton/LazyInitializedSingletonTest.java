package creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LazyInitializedSingletonTest {

    @Test
    void testSingletonInstance() {
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
        assertSame(instance1, instance2);
        assertEquals("Hello from LazyInitializedSingleton!", instance1.sayHello());
    }
}

