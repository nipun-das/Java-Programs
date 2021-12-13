package com.company;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();                                     // area is now an abstract method
}

class Rectanggle extends Figure {
    Rectanggle(double a, double b) {
        super(a, b);
    }

    double area() {                                            // override area for rectangle
        System.out.println("Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Trianggle extends Figure {
    Trianggle(double a, double b) {
        super(a, b);
    }

    double area() {                                            // override area for right triangle
        System.out.println("Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class AbstractClassFigureEg {
    public static void main(String[] args) {

        Rectanggle r = new Rectanggle(9, 5);            // Figure f = new Figure(10, 10); // illegal now
        Trianggle t = new Trianggle(10, 8);

        //Although it is not possible to create an object of type Figure, you can create a reference
        //variable of type Figure. The variable figref is declared as a reference to Figure, which means
        //that it can be used to refer to an object of any class derived from Figure.

        Figure figref = r;
        System.out.println("Area is " + figref.area());
        Figure figreff = t;
        System.out.println("Area is " + figreff.area());
    }
}
