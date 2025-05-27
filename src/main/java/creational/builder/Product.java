package creational.builder;

public class Product {
    private final String partA;
    private final String partB;
    private final String partC;

    // package-private constructor: enforce building via Builder
    Product(ConcreteBuilder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }

    @Override
    public String toString() {
        return "Product{" + "partA='" + partA + '\'' + ", partB='" + partB + '\'' + ", partC='" + partC + '\'' + '}';
    }
}
