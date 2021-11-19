package com.company;

class Rectangle{
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    Rectangle(Rectangle r) {
        length = r.length;
        breadth=r.breadth;
    }

    int findArea()
    {
        int area;
        area = length * breadth;
        return area;
    }
}

public class RectCopyConstructor {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5,6);
        System.out.println("Area of rectangle 1 = " + rect1.findArea());
        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Area of rectangle 2 = " + rect2.findArea());
    }
}
