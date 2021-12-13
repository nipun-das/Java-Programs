package com.JavaPrograms2;

public class GarbageCollection3 {
    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();
        System.out.println(obj1.hashCode());
        obj1 = null;
        System.out.println(obj2.hashCode());
        obj2 = null;
        System.gc();
    }
    public void finalize(){
        System.out.println(" Object is garbage collected ");
    }
}
