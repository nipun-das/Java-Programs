import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int i, j, k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix : ");
        int m = s.nextInt();
        System.out.println("Enter the number of columns of first matrix : ");
        int n = s.nextInt();
        System.out.println("Enter the number of rows of second matrix : ");
        int p = s.nextInt();
        System.out.println("Enter the number of columns of second matrix : ");
        int q = s.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[p][q];
        int c[][] = new int[m][n];
        System.out.println("Enter the elements of first matrix : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Enter the " + "(" + i + "," + j + ")" + " element");
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix : ");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                System.out.println("Enter the " + "(" + i + "," + j + ")" + " element");
                b[i][j] = s.nextInt();
            }
        }

        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum matrix is : ");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
