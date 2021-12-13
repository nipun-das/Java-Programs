package com.JavaPrograms2;

import java.lang.Math;
import java.lang.invoke.CallSite;
import java.util.Scanner;

class Number {
    int calledNumber;

    Number(int a) {
        this.calledNumber = a;
    }
}

class Prime extends Number {

    Prime(int a) {
        super(a);
    }

    void primeCheck() {
        int i, f = 1;
        int n = calledNumber;
        if (n == 1 || n == 0) {
            System.out.println(calledNumber + " is Neither Prime nor Composite");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                System.out.println(calledNumber + " is a Prime Number");
            } else {
                System.out.println(calledNumber + " is not a Prime Number");
            }
        }
    }
}

class Armstrong extends Number {
    Armstrong(int a) {
        super(a);
    }

    void checkArmstrong() {
        int num, r, sum = 0, i = 0;
        num = calledNumber;


        while (num > 0) {
            num = num / 10;
            i++;
        }
        num = calledNumber;
        while (num > 0) {
            r = num % 10;
            sum += Math.pow(r, i);
            num = num / 10;

        }
        if (sum == calledNumber) {
            System.out.println(calledNumber + " is an Armstrong Number");
        } else {
            System.out.println(calledNumber + " is not an Armstrong Number");
        }

    }
}

public class PrimeArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        Prime p = new Prime(number);
        p.primeCheck();
        Armstrong ar = new Armstrong(number);
        ar.checkArmstrong();
    }
}
