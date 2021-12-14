package com.JavaPrograms2;

import java.util.Scanner;

class SymmetricMatrixCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, f = 0, count = 0;
        System.out.println("Enter the order of the matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[n][m];
        System.out.println("Enter the matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Enter the " + i + ", " + j + " element");
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] == b[j][i]) {
                    count++;
                }
            }
        }
        System.out.println("Entered matrix is ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose matrix is ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        if (m == n) {
            if (count == (m * n)) {
                System.out.println("The matrix is symmetric");
            } else {
                System.out.println("The matrix is not symmetric");
            }
        } else {
            System.out.println("Please enter a square matrix");
        }
    }
}
