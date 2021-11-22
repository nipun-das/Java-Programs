import java.util.Scanner;

public class LargestInArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, large;
        System.out.println("Enter the number of elements in the array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array : ");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        large = a[0];
        for (i = 1; i < n; i++) // i=1
        {
            if (a[i] > large)
            {
                large = a[i];
            }
        }
        System.out.print("The array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i]+"\t" );
        }
        System.out.print("\n");
        System.out.println("The largest in the array is : " + large);
    }
}
