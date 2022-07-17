
public class Outer {
    public int a = 1;

    class Inner {
        public int a = 10;

        public void print() {
            int a = 3;
            // locale variable
            System.out.println(a);
            // class variabla
            System.out.println(this.a);
            // outer class variable
            System.out.println(Outer.this.a);
        }
    }

    public void print() {
        Inner inner = new Inner();
        inner.print();
    };

}
