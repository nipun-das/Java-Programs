package com.JavaPrograms2;

public class GarbageCollection2 {
    public static void main(String[] args) {
        GarbageCollection2 obj1 = new GarbageCollection2();
        GarbageCollection2 obj2 = new GarbageCollection2();
        obj1 = null;
        obj2 = null;
        Runtime.getRuntime().gc();
    }
    public void finalize(){
        System.out.println("Object is garbage collected ");
    }
}
