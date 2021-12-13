package com.JavaPrograms2;
class VarLenArg{
    static void method(int ... v){
        System.out.println("length = " +v.length);
        for(int x : v){
            System.out.print(x + " ");
            }
        System.out.println();
    }
    static void method( boolean ... v){
        System.out.println("length = " +v.length);
        for(boolean x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    static void method(String ... s){
        System.out.println("length = "+ s.length);
        for(String x : s){
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
public class VarLengthArguments {
    public static void main(String[] args) {
            VarLenArg.method(2,3,4);
            VarLenArg.method(true,false);
            VarLenArg.method("hi","hello");
    }
}
