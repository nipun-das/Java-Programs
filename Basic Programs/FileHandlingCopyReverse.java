package com.JavaPrograms4;


import java.util.Scanner;
import java.io.*;

class FileHandlingCopyReverse {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s1 = sc.nextLine();
        FileWriter fw = null;
        FileReader fr = null;
        int i, j;
        try {
            fw = new FileWriter("input.txt");
            fr = new FileReader("input.txt");
            fw.write(s1);
            System.out.println("\ninput.txt file is created!");
            fw.close();

            System.out.print("Data in input.txt : ");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File creation failed!");
        }

        String s2 = "";
        for (i = 0; i < s1.length(); i++) {
            s2 = s2 + s1.charAt(i);
        }
        try {
            fw = new FileWriter("output.txt");
            fr = new FileReader("output.txt");
            for (i = s2.length()-1; i >= 0; i--) {
                fw.write(s2.charAt(i));
            }
            System.out.println("\noutput.txt file is created!");
            fw.close();
            System.out.print("Data in output.txt : ");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File creation failed!");
        }
    }
}
