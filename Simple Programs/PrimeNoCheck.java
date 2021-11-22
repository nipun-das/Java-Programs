import java.util.Scanner;

public class PrimeNoCheck {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i, f = 1;
        int n = s.nextInt();
        if (n == 1 || n == 0) {
            System.out.println(n + " is Neither Prime nor Composite");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    f = 0;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(n + " is not a prime number");
            } else {
                System.out.println(n + " is a prime number");
            }
        }
    }

}
