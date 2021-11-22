import java.util.Scanner;

class Dogs {
    Scanner sc = new Scanner(System.in);
    int color, age;
    String breed, size;

    void read() {
        breed = sc.next();
        size = sc.next();
        color = sc.nextInt();
        age = sc.nextInt();
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

public class ObjectExampleDogs {
    public static void main(String Args[]) {
        Dogs dog = new Dogs();
        dog.read();
        dog.sleep();
        dog.eat();
        dog.display();
    }
}
