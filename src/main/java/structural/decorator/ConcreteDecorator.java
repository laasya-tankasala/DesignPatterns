package structural.decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(BaseComponent baseComponent) {
        super(baseComponent);
    }

    @Override
    public String operation() {
        return baseComponent.operation()+ ", ConcreteDecorator";
    }
}
