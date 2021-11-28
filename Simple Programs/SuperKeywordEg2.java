package com.company;

//Inherit classes SquareClass,RectangleClass and TriangleClass from class Shapes and then calculate area of square, rectangle and triangle. Use super() in the program.
class Shapes {
    int length;
    int breadth;

    Shapes(int l, int b) { // pass object to constructor
        this.length = l;
        this.breadth = b;
    }

    Shapes(int l) { // pass object to constructor
        this.length = l;
    }

}
class RectangleClass extends Shapes {
    RectangleClass(int l, int b) {
        super(l, b);
    }

    void findArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class SquareClass extends Shapes {
    SquareClass(int l) {
        super(l);
    }

    void findArea() {
        System.out.println("Area of Square = " + (length * length));
    }
}

class TriangleClass extends Shapes {
    int height;
    TriangleClass(int l,int h) {
        super(l);
        this.height=h;
    }
    void findArea() {
        System.out.println("Area of Triangle = " + (0.5 * length * height));
    }
}

class SuperKeywordEg2 {
    public static void main(String[] args) {
        Shapes sh = new Shapes(10, 10);
        RectangleClass r1 = new RectangleClass(5, 5);
        r1.findArea();
        SquareClass s1 = new SquareClass(6);
        s1.findArea();
        TriangleClass t1 = new TriangleClass(6, 10);
        t1.findArea();
    }
}
