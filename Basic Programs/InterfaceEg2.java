package com.JavaPrograms3;

interface CallBack1 {
    void callback(int param);

    void display();
}

class Client1 implements CallBack1 {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    public void display() {
        System.out.println("signing off");
    }
}

public class InterfaceEg2 {
    public static void main(String[] args) {
        CallBack1 c = new Client1();
        c.callback(3);
        c.display();
    }
}