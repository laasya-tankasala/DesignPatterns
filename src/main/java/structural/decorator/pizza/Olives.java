package structural.decorator.pizza;

public class Olives extends PizzaWithToppings{
    public Olives(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String pizza() {
        return pizza.pizza() + " + olives";
    }

    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
