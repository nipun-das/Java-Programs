package com.company;

//Calculate Percentage of marks of PCMBE Subjects

import java.util.Scanner;

public class MarksPercentageCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Marks of Physics: ");
        int p = s.nextInt();
        System.out.println("Enter the Marks of Chemistry: ");
        int c = s.nextInt();
        System.out.println("Enter the Marks of Maths: ");
        int m = s.nextInt();
        System.out.println("Enter the Marks of Biology: ");
        int b = s.nextInt();
        System.out.println("Enter the Marks of English: ");
        int e = s.nextInt();
        System.out.println("Enter the Total mark of a subject: ");
        int t = s.nextInt();
        float T = (p + c + m + b + e);
        float P, d = (5 * t);
        P = ((T * 100) / d);
        System.out.println("Percentage is : " + P);

    }

}
