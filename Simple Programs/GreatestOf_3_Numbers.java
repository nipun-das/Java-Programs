import java.util.Scanner;

public class GreatestOf_3_Numbers {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the greatest");
            } else {
                System.out.println(c + " is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the greatest");
            } else {
                System.out.println(c + " is the greatest");
            }
        }
    }
}
