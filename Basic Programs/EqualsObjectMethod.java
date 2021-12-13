package com.JavaPrograms2;

public class EqualsObjectMethod {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(a));
    }
}
