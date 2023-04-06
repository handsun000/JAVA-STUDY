package main.java.org.stack;

public class main {
    public static void main(String[] args) {
        Stack st = new Stack(10);

        for (int i = 0; i < st.size(); i++) {
            st.push(i+1);
        }
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.search(6));
    }
}
