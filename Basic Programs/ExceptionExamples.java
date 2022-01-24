package com.JavaPrograms4;

import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entering size in command line
        System.out.println("Enter the sizes of first and second array in CommandLine");
        if (args.length > 0) {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int a[] = new int[m];
            int b[] = new int[n];

            System.out.println("Enter elements of first array : ");
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter elements of second array : ");
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            System.out.print("\nDivision : ");
            for (int i = 0; i < a.length; i++) {
                try {
                    int result = a[i] / b[i];
                    System.out.print(" " + result);
                } catch (ArithmeticException e) {
                    System.out.print(" Division by zero ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(" No elements remaining");
                } catch (NumberFormatException e) {
                    System.out.println(" Number should be entered");
                }
            }
        }
    }
}

