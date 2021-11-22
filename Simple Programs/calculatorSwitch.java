import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        int a, b, c, sum, dif, prd;
        float quo;
        char ch;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first number: ");
            a = s.nextInt();
            System.out.println("Enter second number: ");
            b = s.nextInt();
            System.out.println("Enter operation\n1.Sum\n2.Difference\n3.Product\n4.Quotient");
            c = s.nextInt();

            switch (c) {
                case 1:
                    sum = a + b;
                    System.out.println("SUM = " + sum);
                    break;
                case 2:
                    dif = a - b;
                    System.out.println("DIFFERENCE = " + dif);
                    break;
                case 3:
                    prd = a * b;
                    System.out.println("PRODUCT = " + prd);
                    break;
                case 4:
                    quo = (float) a / b;
                    System.out.println("QUOTIENT = " + quo);
                    break;
                default:
                    System.out.println("Invalid Entry!");
                    break;
            }
            System.out.println("Do you want to calculate again ? (y/n)");
            ch = s.next().charAt(0);
        } while (ch == 'y');
    }
}
