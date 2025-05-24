package structural.decorator.pizza;

public class Bacon extends PizzaWithToppings {

    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String pizza() {
        return pizza.pizza() + " + bacon";
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
