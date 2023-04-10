package main.java.org.stack;

public class ListNodeStack {
    private Node top;
    private int capacity = 0;

    public ListNodeStack() {
        this.top = null;
    }
    class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public void linkNode(Node node) {
            this.next = next;
        }

        public Object getData() {
            return this.data;
        }

        public Node getNextNode() {
            return this.next;
        }
    }

    public void push(int data) {
        Node node = new Node(data);
        node.linkNode(top);
        top = node;
        capacity++;
    }
    public Object pop() {
        top = top.getNextNode();
        capacity--;
        return top.data;
    }
    public Object peek() {
        return top.getData();
    }

    public Object size() {
        return capacity;
    }

}
