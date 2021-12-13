package com.JavaPrograms2;

public class BreakLabelEg1 {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break");
                    if (t) {
                        break second;
                    }
                    System.out.println("Inside if");
                }
                System.out.println("Outside if");
            }
            System.out.println("After second label");
        }
    }
}
