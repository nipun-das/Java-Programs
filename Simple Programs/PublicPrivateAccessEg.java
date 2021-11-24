package com.company;

class Test {
    int a;
    public int b;
    private int c;   //Member c is given private access. This means that this cannot be accessed by code outside of its class.
                     //So inside PublicPrivateAccessEg class, c cannot be used directly. It must be used through its public methods setc() and getc()

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class PublicPrivateAccessEg {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        ob.setc(30);
        System.out.println("a = " + ob.a + "    b = " + ob.b + "    c =   " + ob.getc());
    }
}
