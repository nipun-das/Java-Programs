package com.JavaPrograms2;

//Create a class Square
//Extend Rectangle from it
//Make an eg. for method overriding

class Square {
    int length;
    int breadth;

    Square(int l) {
        length = l;
    }

    void area() {
        int area = length * length;
        System.out.println("Area of square = " + area);
    }
}

class Rectangle extends Square {
    Rectangle(int l, int b) {
        super(l);
        this.breadth = b;
    }

    void area() {
        //super.area();
        System.out.println("Area of Rectangle = " + (length * breadth)); /*When an overridden method is called from within a subclass, it will always
                                                                         refer to the version of that method defined by the subclass.*/
    }                                                                   //To access superclass method area(), super.area() can be used.
}

public class MethodOverridingClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 3);
        rect.area();
    }
}

//Here output will be displaying only the area of rectangle...
// area() method is overridden by the subclass area() method.