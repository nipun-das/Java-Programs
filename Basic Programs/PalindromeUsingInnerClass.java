package com.JavaPrograms2;

/*Write a program to read a number in the outer class.
Check whether that number is a palindrome number using
an inner class method called checkPalindrome( ).*/

import java.util.Scanner;

class OuterClass {

    void readNumber() {
        Scanner sc = new Scanner(System.in);
        InnerClass inner = new InnerClass();
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        inner.checkPalindrome(n);
    }

    class InnerClass {
        void checkPalindrome(int num) {
            int temp, r, rev = 0;
            temp = num;

            while (num != 0) {
                r = num % 10;
                rev = rev * 10 + r;
                num = num / 10;
            }
            if (rev == temp) {
                System.out.println(temp + " is a palindrome number");

            } else {
                System.out.println(temp + " is not a palindrome number");

            }
        }
    }
}

public class PalindromeUsingInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.readNumber();
    }
}
