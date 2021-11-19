package com.company;


class Chain {
    Chain() {
        this(1);
        System.out.println("No parameters");
    }

    Chain(int x) {
        this(x, 7);
        System.out.println("One parameter");
    }

    Chain(int x, int y) {
        System.out.println("Two parameters");

    }
}

public class ConstructorChainEg {
    public static void main(String args[]) {
        Chain ch = new Chain();
    }
}
