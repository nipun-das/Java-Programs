package com.company;

import java.util.Scanner;

public class LinearSearchMultipleOccurence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0, i;
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int e = s.nextInt();
        for (i = 0; i < n; i++) {
            if (e == a[i]) {
                System.out.println("Element " + e + " is found at location " + (i + 1));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found");
        }
    }
}

