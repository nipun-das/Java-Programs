package com.company;

class Boxx {
    private double width;
    private double height;
    private double depth;
    // construct clone of an object
    Boxx(Boxx ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Boxx() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Boxx(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
// BoxWeight now fully implements all constructors.
class BoxWeightt extends Box {
    double weight; // weight of box
    // construct clone of an object
    BoxWeightt(BoxWeightt ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
    // constructor when all parameters are specified
    BoxWeightt(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }
    // default constructor
    BoxWeightt() {
        super();
        weight = -1;
    }
    // constructor used when cube is created
    BoxWeightt(double len, double m) {
        super(len);
        weight = m;
    }
}
class SuperKeywordEg {
    public static void main(String args[]) {
        BoxWeightt mybox1 = new BoxWeightt(10, 20, 15, 34.3);
        BoxWeightt mybox2 = new BoxWeightt(2, 3, 4, 0.076);
        BoxWeightt mybox3 = new BoxWeightt(); // default
        BoxWeightt mycube = new BoxWeightt(3, 2);
        BoxWeightt myclone = new BoxWeightt(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }
}