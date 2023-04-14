package main.java.org.queue;

public class ArrayQueue {
    int max = 1000;
    int front = 0;
    int rear = 0;
    int [] queue;

    public ArrayQueue() {
        front = rear = 0;
        queue = new int[max];
    }

    public void add(int data) {
        if (queueIsFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }
    
    public int peek() {
        if (queueIsEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int pop() {
        if (queueIsEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front++];
    }

    public String toString() {
        String str = "[";
        for (int i = front; i < rear; i++) {
            str += queue[i];
            if (i != rear-1) str += ",";
        }

        return str += "]";
    }

    private boolean queueIsEmpty() {
        return rear == front;
    }

    private boolean queueIsFull() {
        return rear == max-1;
    }
}
