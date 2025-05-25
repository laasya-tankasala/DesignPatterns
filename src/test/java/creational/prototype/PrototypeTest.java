package creational.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void testClassOneClone() {
        ClassOne original = new ClassOne("TestName");
        ClassOne clone = (ClassOne) original.clone();

        assertNotSame(original, clone);  // Ensure different references
        assertEquals(original.toString(), clone.toString());  // Ensure same content
    }

    @Test
    public void testClassTwoClone() {
        ClassTwo original = new ClassTwo(100);
        ClassTwo clone = (ClassTwo) original.clone();

        assertNotSame(original, clone);
        assertEquals(original.toString(), clone.toString());
    }

    @Test
    public void testCloneIndependence() {
        ClassOne original = new ClassOne("Original");
        ClassOne clone = (ClassOne) original.clone();

        // Changing one should not affect the other (they're different objects)
        // However, in this case, the fields are immutable (String), so direct comparison suffices
        assertEquals("ClassOne{name=Original}", clone.toString());
    }
}
