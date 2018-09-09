public class ClassA {
    private final String name = "classA";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "name='" + name + '\'' +
                '}';
    }
}