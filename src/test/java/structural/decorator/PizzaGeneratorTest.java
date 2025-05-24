package structural;

import org.junit.jupiter.api.Test;
import structural.decorator.pizza.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaGeneratorTest {

    @Test
    void prepareMargheritaPizzaWithNoToppings() {
        Pizza margheritaPizza = new MargheritaPizza();
        assertEquals("Margherita Pizza", (margheritaPizza.pizza()));
    }

    @Test
    void prepareBBQPizzaWithExtraCheese() {
        Pizza bBQWithExtraCheese = new ExtraCheese(new BBQPizza());
        assertEquals("BBQ Pizza + extra cheese", bBQWithExtraCheese.pizza());
        assertEquals(105, bBQWithExtraCheese.cost());
    }

    @Test
    void prepareMargheritaPizzaWithOlivesAndBacon() {
        Pizza margheritaWithBaconAndOlives = new Bacon(new Olives(new MargheritaPizza()));
        assertEquals("Margherita Pizza + olives + bacon", margheritaWithBaconAndOlives.pizza());
        assertEquals(130, margheritaWithBaconAndOlives.cost());
    }

}
