package com.company;

class Static {
    static int a = 3;
    static int b;

    static void method(int x) {
        System.out.println("x = " + x + "    a = " + a + "    b = " + b);
    }

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }
}
public class StaticKeywordMethodCall {
    public static void main(String[] args) {
                                                     //Static methods and variables can be used independently for any object
        Static.method(42);                        //classname,method();
    }
}
