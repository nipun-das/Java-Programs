package com.company;

class Checker {
    void test(int x, int y) {
        x = 1;
        y = 1;
    }
}

public class ArgPassCallByValue {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Before call, a = " + a + " and b = " + b);
        Checker c = new Checker();
        c.test(a, b);
        System.out.println("After call, a = " + a + " and b = " + b);
    }
}
