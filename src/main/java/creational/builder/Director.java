package creational.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product constructBasicProduct() {
        return builder
                .setPartA("Default A")
                .setPartB("Default B")
                .setPartC("Default C")
                .build();
    }

    public Product constructMinimalProduct() {
        return builder
                .setPartA("Only A")
                .build();
    }

    public Product constructCustomProduct(String a, String b, String c) {
        return builder
                .setPartA(a)
                .setPartB(b)
                .setPartC(c)
                .build();
    }
}

