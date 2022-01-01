import java.util.Scanner;
public class UpperTriangular
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the order of the matrix:");
        int r = s.nextInt();
        int c = s.nextInt();
        int a[][] = new int[r][c];
        //initialize matrix a
        if (r != c) {
            System.out.println("matrix is to be square");
        } else {
            System.out.println("enter the elements :");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("matrix is:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("upper triangular matrix is:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i > j)
                        System.out.print("0"+"\t");
                    else
                        System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        }

    }
}
