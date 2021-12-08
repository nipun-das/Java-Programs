class Outer2 {
    int outer_x = 100;
    Inner inner = new Inner();
    void test() {
        inner.display();
    }
    class Inner {
        int y = 10;                     // y is local to Inner
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    void showy() {
        System.out.println("display: y = " + inner.y);
    }
}
public class NonStaticInnerClass2  {
    public static void main(String args[]) {
        Outer2 outer = new Outer2();
        outer.test();
        outer.showy();
    }
}
