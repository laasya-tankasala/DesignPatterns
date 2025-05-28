package behavioral;

import behavioral.iterator.ConcreteAggregate;
import behavioral.iterator.Iterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class IteratorPatternTest {
    private ConcreteAggregate<String> aggregate;

    @BeforeEach
    void setUp() {
        aggregate = new ConcreteAggregate<>();
        aggregate.addItem("One");
        aggregate.addItem("Two");
        aggregate.addItem("Three");
    }

    @Test
    void testIteratorTraversal() {
        Iterator<String> iterator = aggregate.createIterator();

        assertTrue(iterator.hasNext());
        assertEquals("One", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("Two", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("Three", iterator.next());

        assertFalse(iterator.hasNext());
        assertNull(iterator.next());
    }

    @Test
    void testIteratorWithMockito() {
        @SuppressWarnings("unchecked")
        Iterator<String> mockIterator = mock(Iterator.class);

        when(mockIterator.hasNext()).thenReturn(true, true, false);
        when(mockIterator.next()).thenReturn("X", "Y");

        assertTrue(mockIterator.hasNext());
        assertEquals("X", mockIterator.next());

        assertTrue(mockIterator.hasNext());
        assertEquals("Y", mockIterator.next());

        assertFalse(mockIterator.hasNext());

        verify(mockIterator, times(2)).next();
        verify(mockIterator, times(3)).hasNext();
    }
}
