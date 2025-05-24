package structural.decorator;

public abstract class Decorator implements BaseComponent{

    protected BaseComponent baseComponent;

    public Decorator(BaseComponent baseComponent) {
        this.baseComponent = baseComponent;
    }

    @Override
    public String operation() {
        return "Decorator";
    }

}
