package com.JavaPrograms4;

class MyException extends Exception {

    MyException(String s) {
        super(s);
    }
}

public class UserDefinedException {
    public static void main(String[] args){
        int i, sum = 0,count=0;
        float avg;
        for (i = 0; i < args.length; i++) {
            if(Integer.parseInt(args[i]) > 0){
                sum = sum + Integer.parseInt(args[i]);
                count++;
            }
            try {
                if (Integer.parseInt(args[i]) < 0) {
                    throw new MyException("Negative Encounter Exception caught!!");
                }
                if (Integer.parseInt(args[i]) == 0) {
                    throw new MyException("Zero Encounter Exception caught!!");
                }
            }
            catch(MyException e){
                System.out.println(e);
            }
        }
        avg = (float) sum / count;
        System.out.println("Average : " + avg);
    }
}
