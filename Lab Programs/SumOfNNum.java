import java.util.Scanner;

public class SumOfNNum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int i = 0, sum = 0;
        int n = s.nextInt();
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The Sum up to " + n + " is " + sum);
    }

}
