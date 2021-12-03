package com.JavaPrograms2;


public class CommandLineSecondLargestNumber {

    public static void main(String[] args) {
        if (args.length > 0) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a > b) {
                if (a > c) {
                    System.out.println(b + " is the second largest");
                } else {
                    System.out.println(a + " is the second largest");
                }
            } else {
                if (b<c) {
                    System.out.println(b + " is the second largest");
                }
                else {
                    System.out.println(c+ " is the second largest");
                }
            }
        }
    }
}
