package com.JavaPrograms2;

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Name = " + args[0]);
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            System.out.println("Sum = " + (a + b));
        }
    }
}
//Run ---> Edit config.