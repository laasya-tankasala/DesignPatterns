package creational.prototype;

public class ClassTwo implements Prototype{

    private int value;

    public ClassTwo(int value) {
        this.value = value;
    }

    // Copy Constructor
    public ClassTwo(ClassTwo original) {
        this.value = original.value;
    }

    @Override
    public Prototype clone() {
        return new ClassTwo(this);
    }

    @Override
    public String toString() {
        return "ClassTwo{value=" + value + "}";
    }

}
