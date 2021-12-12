import java.util.Scanner;

//Menu-driven program for checking identity matrix and finding transpose
public class TransposeAndIdentityMatrix {


    public static void main(String[] args) {
        int opt;
        do {
            Scanner sc = new Scanner(System.in);
            TransposeAndIdentityMatrix obj = new TransposeAndIdentityMatrix();
            int i, j, c, m, n;
            System.out.print("Enter the no. of rows of the matrix : ");
            m = sc.nextInt();
            System.out.print("Enter the no. of columns of the matrix : ");
            n = sc.nextInt();
            int a[][] = new int[m][n];
            System.out.println("Enter the elements of first matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print("Enter the " + "(" + i + "," + j + ")" + " element : ");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the choice\n1.Check for Identity Matrix\n2.Find Transpose\n3.Exit");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    obj.identityCheck(a, m, n);
                    break;
                case 2:
                    obj.findTranspose(a, m, n);
                    break;
                case 3:
                    break;

            }
            System.out.println("Perform once more?(1/0)");
            opt = sc.nextInt();
        } while (opt == 1);
    }

    void identityCheck(int a[][], int m, int n) {

        int i, j, f = 1;
        if (m == n) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < m; j++) {
                    if (i == j && a[i][j] != 1) {
                        f = 0;
                        break;
                    }
                    if (i != j && a[i][j] != 0) {
                        f = 0;
                        break;
                    }
                }
            }
            System.out.println("The matrix you entered is : ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print("\t" + a[i][j]);
                }
                System.out.println();
            }
            if (f == 1) {
                System.out.println("The matrix is an identity matrix");
            } else {
                System.out.println("The matrix is not an identity matrix");
            }
        } else {
            System.out.println("Please enter a square matrix");
        }
    }

    void findTranspose(int a[][], int m, int n) {
        int i, j;
        int b[][] = new int[n][m];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("The matrix you entered is : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose matrix is : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("\t" + b[i][j]);
            }
            System.out.println();
        }
    }
}


