public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.print();

        Outer.Inner innerInstance = outer.new Inner();
        innerInstance.print();
    }
}