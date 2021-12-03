package com.JavaPrograms2;

import java.util.Scanner;

public class DataTypeExample2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer value : ");
        int a = s.nextInt();
        byte b = (byte)a;
        System.out.println("Byte value is : "+b);
    }
}
