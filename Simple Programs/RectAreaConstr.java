//To calculate area of two rectangles using Constructors
class Rect {
    int length;
    int breadth;

    Rect(int l, int b) {
        length = l;                                                     //      Below commented codes can also be used altogether instead of the ones in the respective lines
        breadth = b;
    }

    int findArea()                                                      //      void findArea()
    {
        int area;
        area = length * breadth;
        return area;                                                    //      System.out.println("Area is "+ area);
    }
}

public class RectAreaConstr {
    public static void main(String Args[]) {
        Rect rect1 = new Rect(5, 6);
        System.out.println("Area of rectangle 1 = " + rect1.findArea());      //      rect1.findArea();
        Rect rect2 = new Rect(6, 7);
        System.out.println("Area of rectangle 2 = " + rect2.findArea());      //      rect2.findArea();
    }
}
