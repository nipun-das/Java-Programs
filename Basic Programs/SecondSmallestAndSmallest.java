//Implement a JAVA program to display the smallest and second-smallest element of an array.

import java.util.Scanner;

public class SecondSmallestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, smallest, secondSmallest;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        smallest = a[0];
        secondSmallest = a[1];
        for (i = 0; i < n; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if ((a[i] > smallest) && (a[i] < secondSmallest)) {
                secondSmallest = a[i];
            }
        }
        System.out.println();
        System.out.print("The entered array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Smallest in the array is : " + smallest);
        System.out.println("Second smallest in the array is : " + secondSmallest);
    }
}

