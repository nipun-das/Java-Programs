/*Dynamic method dispatch is the mechanism
by which a call to an overridden method is resolved at run time, rather than compile time.
Dynamic method dispatch is important because this is how Java implements run-time
polymorphism
Overridden methods are another way that Java implements the “one interface, multiple methods” aspect of polymorphism.*/
class A {
    void callMe() {
        System.out.println("Inside A ");
    }
}

class B extends A {
    void callMe() {
        System.out.println("Inside B");
    }
}

class C extends A {
    void callMe() {
        System.out.println("Inside C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();              // object of type A
        B b = new B();              // object of type B
        C c = new C();              // object of type C
        A r;                        // obtain a reference of type A
        r = a;                      // r refers to an A object
        r.callMe();                 // calls A's version of callMe
        r = b;                      // r refers to a B object
        r.callMe();                 // calls B's version of callMe
        r = c;                      // r refers to a C object
        r.callMe();                  // calls C's version of callMe
    }
}

