package com.JavaPrograms2;
/*Implement a JAVA program to determine whether the given matrix is an identity matrix or not.*/

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n, f = 0;
        System.out.println("Enter the order of the matrix : ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        if (m != n) {
            System.out.println("Please enter a square matrix ");
        } else {
            System.out.println("Enter the elements of the matrix :");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if (i == j && a[i][j] != 1) {
                        f = 1;
                        break;
                    }
                    if (i != j && a[i][j] != 0) {
                        f = 1;
                        break;
                    }
                }
            }
            System.out.println("The matrix entered is : ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "  ");
                }
                System.out.println();
            }
            if (f == 0) {
                System.out.println("The matrix is an identity matrix");
            } else {
                System.out.println("The matrix is not an identity matrix");
            }
        }
    }
}


