package creational.prototype;

public class ClassOne implements Prototype{

    private String name;

    public ClassOne(String name) {
        this.name = name;
    }

    public ClassOne(ClassOne original) {
        this.name = original.name;
    }

    @Override
    public Prototype clone() {
        return new ClassOne(this);
    }

    @Override
    public String toString() {
        return "ClassOne{name=" + name + "}";
    }

}
