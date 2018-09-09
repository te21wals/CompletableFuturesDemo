public class ABCData {
    private ClassA classA;
    private ClassB classB;
    private ClassC classC;

    public ABCData(ClassA classA, ClassB classB, ClassC classC) {
        this.classA = classA;
        this.classB = classB;
        this.classC = classC;
    }

    public ClassA getClassA() {
        return classA;
    }

    public ClassB getClassB() {
        return classB;
    }

    public ClassC getClassC() {
        return classC;
    }

    @Override
    public String toString() {
        return "ABCData{" +
                "classA=" + classA.toString() +
                ", classB=" + classB.toString() +
                ", classC=" + classC.toString() +
                '}';
    }
}
