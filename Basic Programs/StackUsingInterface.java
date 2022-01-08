package com.JavaPrograms3;


interface IntStack {
    void push(int item);

    int pop();
}

class FixedStack implements IntStack {
    private int stack[];
    private int top;

    FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack full");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stack[top--];
        }
    }
}

public class StackUsingInterface {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(10);

        for (int i = 0; i < 5; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }
        System.out.println("Stack 1 : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println("\n");
        System.out.println("Stack 2 : ");
        for (int i = 0; i < 8; i++) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
