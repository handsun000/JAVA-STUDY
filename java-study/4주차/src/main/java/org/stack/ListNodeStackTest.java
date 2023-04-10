package main.java.org.stack;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ListNodeStackTest {

    @Test
    @DisplayName("push 테스트")
    public void push() {
        ListNodeStack listNodeStack = new ListNodeStack();
        for (int i = 0; i < 5; i++) {
            listNodeStack.push(i+1);
        }

        assertEquals(listNodeStack.peek(),listNodeStack.size());
    }

    @Test
    @DisplayName("pop 테스트")
    public void pop() {
        ListNodeStack listNodeStack = new ListNodeStack();

        for (int i = 0; i < 5; i++) {
            listNodeStack.push(i+1);
        }

        assertAll(
                () -> assertEquals(listNodeStack.peek(), listNodeStack.size()),
                () -> assertEquals(listNodeStack.pop(), 5),
                () -> assertEquals(listNodeStack.peek(), listNodeStack.size())
        );
    }
}
