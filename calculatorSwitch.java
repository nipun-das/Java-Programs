import java.util.Scanner;

public class Main
{
    public static void main(String args[] )
    {
	    System.out.println("Enter numbers");
        Scanner s= new Scanner(System.in);
        int a,b,c,sum,dif,prd,quo;
        System.out.println("Enter first number: ");
        a = s.nextInt();
        System.out.println("Enter second number: ");
        b = s.nextInt();
        System.out.println("Enter operation 1.sum 2.difference 3.product 4.quotient");
        c=s.nextInt();
        switch (c)
        {
            case 1:
                sum = a+b ;
                System.out.println("SUM="+sum);
                break;
            case 2:
                dif=a-b;
                System.out.println("DIFFERENCE="+dif);
                break;
            case 3:
                prd=a*b;
                System.out.println("PRODUCT="+prd);
                break;
            case 4:
                quo=a/b;
                System.out.println("QUOTIENT="+quo);
                break;
            default:
                break;
        }
    }
}
