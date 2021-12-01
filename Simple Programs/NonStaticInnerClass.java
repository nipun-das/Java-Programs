package com.JavaPrograms2;

class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
public class NonStaticInnerClass {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}