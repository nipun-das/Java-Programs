package com.company;
class Check{
    int a,b;

    Check(int x, int y) {
        a = x;
        b = y;
    }
    void test(Check o) {
        o.a = 1;
        o.b = 1;
    }
}
public class ArgPassCallByRef {
    public static void main(String[] args) {
        Check ch = new Check(2,3);
        System.out.println("Before call, a = " + ch.a + " and b = " + ch.b);
        ch.test(ch);
        System.out.println("After call, a = " + ch.a + " and b = " + ch.b);
    }
}
