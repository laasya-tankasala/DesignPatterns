package structural.decorator.pizza;

public abstract class PizzaWithToppings extends Pizza{

    protected Pizza pizza;

    public PizzaWithToppings(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String pizza() {
        return pizza.pizza();
    }

}
