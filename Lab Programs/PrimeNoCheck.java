package com.company;

import java.util.Scanner;

public class PrimeNoCheck {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i , sum = 0, count = 1;
        int n = s.nextInt();
        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 3) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }
    }

}
