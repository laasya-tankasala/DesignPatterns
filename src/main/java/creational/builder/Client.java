package creational.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        Product basic = director.constructBasicProduct();
        Product minimal = director.constructMinimalProduct();
        Product custom = director.constructCustomProduct("Aa", "Bb", "Cc");

        System.out.println("Basic:   " + basic);
        System.out.println("Minimal: " + minimal);
        System.out.println("Custom:  " + custom);
    }
}
