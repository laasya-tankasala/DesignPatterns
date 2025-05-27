package creational.builder;

public interface Builder {
    Builder setPartA(String partA);
    Builder setPartB(String partB);
    Builder setPartC(String partC);
    Product build();
}
