public class CommandLinePrime {
    public static void main(String[] args) {
        if (args.length > 0)
        {
            int l = Integer.parseInt(args[0]);
            int u = Integer.parseInt(args[1]);
            int f = 1;
            for (int i = l + 1; i <= u - 1; i++)
            {
                f = 1;
                for (int j = 2; j <= i / 2; j++)
                {
                    if (i % j == 0) {
                        f = 0;
                        break;
                    }
                }
                if (f == 1)
                {
                    System.out.print(i + "\t");
                }
            }
        }
    }
}

//System.out.println("Name = " + args[0]);
//        int a = Integer.parseInt(args[1]);
//        int b = Integer.parseInt(args[2]);
//        System.out.println("Sum = " + (a + b));

//for (i = l + 1; i <= u - 1; i++)      /*Since prime numbers between two limits is to printed, setting i = l + 1 and i <= u - 1  */
//        {
//        f = 1;                            /*Setting flag as 1 to assume its a prime number*/
//        for (j = 2; j <= i / 2; j++)
//        {
//        if (i % j == 0)
//        {
//        f = 0;                    /*Setting flag as 0 when its not a prime number*/
//        break;
//        }
//        }
//        if (f == 1)                       /*Calling flag 1 to print everytime in the loop as prime numbers*/
//        {
//        printf("%d\t", i);
//        }
//        }
