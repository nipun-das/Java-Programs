import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i, j, temp;
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j ] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}

