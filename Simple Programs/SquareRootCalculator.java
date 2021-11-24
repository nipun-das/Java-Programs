package com.company;

import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        float a = s.nextFloat();
        double b =Math.sqrt(a);
        float c = (float)b;
        System.out.println("Square root in double = "+b);
        System.out.println("Square root in float = "+c);
    }
}
