package main.java.org.stack;

import java.rmi.server.ExportException;
import java.sql.SQLOutput;

public class Stack {

    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int input) {
        if (isFull()) {
            System.out.println("가득참");
            System.exit(-1);
        }
        arr[++top] = input;
    }

    public Object pop() {

        if (isEmpty()) {
            System.out.println("비었음");
            System.exit(-1);
        }

        return arr[top--];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("비었음");
            System.exit(-1);
        }
        return arr[top];
    }


    public Object search(int input) {
        if (input>top || isEmpty()){
            System.out.println("찾을수 없음");
            System.exit(-1);
        }

        return arr[input];
    }

    public int size() {
        return capacity;
    }

    private boolean isFull() {
        return top == capacity -1;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
