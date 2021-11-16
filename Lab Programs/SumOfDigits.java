package com.company;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int r, rSum = 0;
        int n = s.nextInt();
        while (n > 0) {
            r = n % 10;
            rSum += r;
            n = n / 10;
        }
        System.out.println("The sum of the digits is: " + rSum);


    }
}
