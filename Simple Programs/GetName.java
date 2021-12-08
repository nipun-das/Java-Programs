public class GetName {
    public static void main(String[] args) {
        Object obj1 = new String("Hello");
        Class c1 = obj1.getClass();
        System.out.println("Class of object obj1 is : "+ c1.getName());
        Object obj2 = new Integer(5);
        Class c2 = obj2.getClass();
        System.out.println("Class of object obj2 is : "+c2.getName());
        Object obj3 = new Float(0.1f);
        Class c3 = obj3.getClass();
        System.out.println("Class of object obj3 is : "+c3.getName());
    }
}
