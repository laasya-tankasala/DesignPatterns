package structural.decorator.pizza;

public class ExtraCheese extends PizzaWithToppings{
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String pizza() {
        return pizza.pizza() + " + extra cheese";
    }

    @Override
    public int cost() {
        return pizza.cost() + 5 ;
    }
}
