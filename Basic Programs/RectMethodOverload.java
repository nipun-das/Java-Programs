package com.company;

//  Method overloading is a feature of Java in which a class has more than one method
//  of the same name and their parameters are different.
//  Example for compile-time polymorphism

class RectClass{
    int area(int l, int b)
    {
        int area=l*b;
        return area;
    }
    float area(float l, float b)
    {
        float area=l*b;
        return area;
    }
}

public class RectMethodOverload {
    public static void main(String[] args) {
        RectClass rect1 = new RectClass();
        System.out.println("AREA OF RECTANGLE 1 IS "+rect1.area(2,3));
        RectClass rect2 = new RectClass();
        System.out.println("AREA OF RECTANGLE 2 IS "+rect1.area(0.2f,0.3f));
    }
}
