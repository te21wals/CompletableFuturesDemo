public class CombindFunctionImpl implements CombindFunction {
    public ABCData combind (ClassA a, ClassB b, ClassC c) {
        return new ABCData(a, b, c);
    }
}
