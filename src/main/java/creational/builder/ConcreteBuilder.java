package creational.builder;

public class ConcreteBuilder implements Builder {

    //package-private fields
    String partA;
    String partB;
    String partC;

    @Override
    public Builder setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    @Override
    public Builder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    @Override
    public Builder setPartC(String partC) {
        this.partC = partC;
        return this;
    }

    @Override
    public Product build() {
        return new Product(this);
    }
}
