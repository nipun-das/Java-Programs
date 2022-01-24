package com.JavaPrograms4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderVowelsConsonants {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nv = 0, nc = 0, ns = 0, i = 0;
        System.out.println("Enter the string:");
        String str = br.readLine();
        for (i = 0; i<str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                nv++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                nc++;
            }
        }
        System.out.println("Number of Vowels is " + nv);
        System.out.println("Number of Consonants is " + nc);
    }
}
