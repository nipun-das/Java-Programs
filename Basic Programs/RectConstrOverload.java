package com.company;

class BoxConstrOverload {
    double length;
    double breadth;
    double height;

    BoxConstrOverload()                   //Constructor when no dimensions are specified
    {
        length = -1;    //-1 is simply used to indicate uninitialized box
        breadth = -1;
        height = -1;
    }

    BoxConstrOverload(double l, double b, double h)  //Constructor when all three dimensions are specified
    {
        length = l;
        breadth = b;
        height = h;
    }

    BoxConstrOverload(double len) {       //Constructor used when cube is created
        length = breadth = height = len;
    }

    double volume() {
        double vol;
        return vol = length * breadth * height;
    }
}

public class RectConstrOverload {

    public static void main(String[] args) {
        BoxConstrOverload cube1 = new BoxConstrOverload();         //No dimensions specified
        System.out.println("Volume 1 = " + cube1.volume());
        BoxConstrOverload cube2 = new BoxConstrOverload(10, 20, 30); //All dimension specified
        System.out.println("Volume 2 = " + cube2.volume());
        BoxConstrOverload cube3 = new BoxConstrOverload(10);         //When single dimension is specified if volume of cube is to be calculated.
        System.out.println("Volume 3 = " + cube3.volume());

    }
}
