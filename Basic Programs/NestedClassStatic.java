package com.JavaPrograms2;
class Nested1{
    void display(){
        System.out.println("Inside Outer class");
    }
    static class StaticNested{
        void displayNested(){
            Nested1 n1 = new Nested1();                 //Inorder to call a method of the superclass from inside a static class we should
                                                        // create an object of the superclass
            n1.display();
            System.out.println("Inside Inner class");
        }
    }
}
public class NestedClassStatic {
    public static void main(String[] args) {
        Nested1.StaticNested s = new Nested1.StaticNested();
        s.displayNested();
    }
}

//Here output will be -
//Inside Outer class
//Inside Inner class