package headFirst;

public class InnerClassTest {

    private int x;

    TheInnerOne inner = new TheInnerOne();

    public void doStuff(){
        inner.go();
    }

    public static void main(String[] args) {
        InnerClassTest outer = new InnerClassTest();
        outer.inner.go();
        System.out.println(outer.x);
    }

    class TheInnerOne {

        void go(){
            x = 42; // Inner Class' object can access everything in the tied Outer class' object
        }

    }

}
