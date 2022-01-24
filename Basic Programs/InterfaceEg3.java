package com.JavaPrograms3;


interface Callback2 {
    void callback(int param);

    void display(String s);
}

abstract class Client2 implements Callback2 {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

}

class ClientSub extends Client2 {
    public void display(String s) {
        System.out.println(s);
    }
}

public class InterfaceEg3 {
    public static void main(String[] args) {
        ClientSub obj = new ClientSub();
        obj.callback(3);
        obj.display("Hello");
    }
}
