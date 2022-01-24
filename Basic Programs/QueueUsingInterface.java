package com.JavaPrograms3;


interface QueueInt {
    void enqueue(int item);
    int dequeue();
}

class Queue implements QueueInt {
    private int queue[];
    private int front;
    private int rear;

    Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == queue.length - 1) {
            System.out.println("Queue overflow");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = item;
        } else {
            rear++;
            queue[rear] = item;
        }
    }

    public int dequeue() {
        int del;
        if (front == -1 && rear == -1) {
            System.out.println("\nQueue underflow");
            return 0;
        } else if (front == rear) {
            del = queue[front];
            front = rear = -1;
            return del;
        } else {
            del = queue[front++];
            return del;
        }
    }
}

public class QueueUsingInterface {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }

        System.out.print("Queue: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
