class Outer3 {
    int outer_x = 1;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                    outer_x+=1;
                }
            }
        Inner inner = new Inner();
        inner.display();
        }
    }
}

public class NonStaticInnerClass3 {
    public static void main(String args[]) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
