import java.util.Scanner;

public class DataTypeExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a byte value : ");
        byte b = s.nextByte();
        System.out.println("Byte value is : " + b);
        System.out.print("Enter a short value : ");
        short sh = s.nextShort();
        System.out.println("Short value is : " + sh);
        System.out.print("Enter an integer value :  ");
        int in = s.nextInt();
        System.out.println("Integer value is : " + in);
        System.out.print("Enter a long value : ");
        long lg = s.nextLong();
        System.out.println("Long value is : " + lg);
        System.out.print("Enter a float value :  ");
        float fl = s.nextFloat();
        System.out.println("Float value is : " + fl);
        System.out.print("Enter a boolean value :  ");
        boolean boo = s.nextBoolean();
        System.out.println("Boolean value is : " + boo);
        System.out.print("Enter a character :  ");
        char str = s.next().charAt(0);
        System.out.println("Character is  : " + str);

    }
}
