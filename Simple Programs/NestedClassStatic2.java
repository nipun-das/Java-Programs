package com.JavaPrograms2;

class Nested2{
    static int a = 1;
    private  static int b = 2;
    int c = 3;
    static void display(){
        StaticNestedClass n = new StaticNestedClass();     // Object of StaticNestedClass is created inorder to access its method displayNested()
        System.out.println("Inside Outer class");
        n.displayNested();
    }
    static class StaticNestedClass{
        void displayNested(){
            Nested2 n2 = new Nested2();
            System.out.println("Inside Inner class");
            System.out.println("value of a = "+a);
            System.out.println("value of b = "+b);
            System.out.println("value of c = "+n2.c);   // Here int c should be accessed via the object of Nested 2
                                                        // because it cannot access non-static data members and methods.
        }
    }
}
public class NestedClassStatic2 {
    public static void main(String[] args) {
        Nested2 s = new Nested2();
        s.display();
    }
}

/*here output is -
Inside Outer class
Inside Inner class
value of a = 1
value of b = 2
value of c = 3*/
