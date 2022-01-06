package com.JavaPrograms3;


interface CallBack {
    void callback(int param);
}

class Client implements CallBack {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void display() {
        System.out.println("signing off");
    }
}

public class InterfaceEg1 {
    public static void main(String[] args) {
        Client c = new Client();
        c.callback(3);
        c.display();
    }
}

