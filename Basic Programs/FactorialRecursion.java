package com.company;

import java.util.Scanner;

class Factorial {
    int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}

public class FactorialRecursion {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        System.out.println("The factorial of " + n + " is " + f.fact(n));
    }

}
