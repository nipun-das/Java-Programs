class DogsConst{
    String breed;
    String size;
    String color;
    int age;
    DogsConst(String b,String sz,String c,int a)
    {
        breed = b;
        size = sz;
        color = c;
        age = a;
    }
    void sleep() {
        System.out.println(breed + " is sleeping");
    }

    void eat() {
        System.out.println(breed + " is eating");
    }

    void display() {
        System.out.println("Breed = " + breed);
        System.out.println("Size = " + size);
        System.out.println("Color = " + color);
        System.out.println("Age = " + age);
    }
}
public class ConstructorExample {
    public static void main(String args[])
    {
        DogsConst dog = new DogsConst("German Shepherd","Medium","Brown",5);
        dog.display();
        dog.eat();
        dog.sleep();
    }
}
