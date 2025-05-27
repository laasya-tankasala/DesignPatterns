package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderPatternTest {

        @Test
        void testBuildCompleteProduct() {
            Product product = new ConcreteBuilder()
                    .setPartA("A")
                    .setPartB("B")
                    .setPartC("C")
                    .build();

            assertEquals("Product{partA='A', partB='B', partC='C'}", product.toString());
        }

        @Test
        void testBuildPartialProduct() {
            Product product = new ConcreteBuilder()
                    .setPartA("A")
                    .build();

            assertEquals("Product{partA='A', partB='null', partC='null'}", product.toString());
        }

}
