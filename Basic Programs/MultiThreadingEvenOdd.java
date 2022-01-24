package com.JavaPrograms4;

import java.util.Random;

class Square extends Thread {
    int x;

    Square(int a) {
        this.x = a;
    }

    public void run() {
        try {
            int sq = (x * x);
            System.out.println(x + " is even");
            System.out.println("Square of " + x + " is " + sq);
            Thread.sleep(200);

        } catch (
                InterruptedException e) {
            System.out.println("Interruption occurred");
        }
    }
}
class Cube extends Thread {
    int x;

    Cube(int a) {
        this.x = a;
    }

    public void run() {
        try {
            int c = (x * x * x);
            System.out.println(x + " is odd");
            System.out.println("Cube of " + x + " is " + c);
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Interruption occurred");
        }
    }
}

class Number extends Thread {

    public void run() {
        try {
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                Thread.sleep(300);
                System.out.println("\nGenerating random number...");
                int randomNumber = random.nextInt(50);
                System.out.println("Random number generated : " + randomNumber);
                if (randomNumber % 2 == 0) {
                    Square evenThread = new Square(randomNumber);
                    evenThread.start();
                } else {
                    Cube oddThread = new Cube(randomNumber);
                    oddThread.start();
                }
            }

        } catch (InterruptedException e) {
            System.out.println("interruption occurred");
        }
    }
}

public class MultiThreadingEvenOdd {
    public static void main(String[] args) {
        Number numThread = new Number();
        numThread.start();
    }
}
