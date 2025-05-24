package structural;

import org.junit.jupiter.api.Test;
import structural.decorator.BaseComponent;
import structural.decorator.ConcreteComponent;
import structural.decorator.ConcreteDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest{

    @Test
    void testConcreteComponent() {
        assertEquals("ConcreteComponent", new ConcreteComponent().operation());
    }

    @Test
    void testConcreteDecoratorWithConcreteComponent() {
        assertEquals("ConcreteComponent, ConcreteDecorator", new ConcreteDecorator(new ConcreteComponent()).operation());
    }

    @Test
    public void testWithMultipleDecorators() {
        BaseComponent component = new ConcreteDecorator(
                new ConcreteDecorator(
                        new ConcreteComponent()));
        assertEquals("ConcreteComponent, ConcreteDecorator, ConcreteDecorator", component.operation());
    }
}
