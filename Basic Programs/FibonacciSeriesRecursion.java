package com.company;

import java.util.Scanner;

class Fibonacci {
    int fibo(int ind) {
        if (ind == 0 || ind == 1) {
            return ind;
        } else {
            return (fibo(ind - 1) + fibo(ind - 2));
        }
    }
}

public class FibonacciSeriesRecursion {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of elements for the series : ");
        int n = s.nextInt();
        System.out.println("The Fibonacci series of " + n + " elements is : ");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + f.fibo(i));
        }
    }
}

