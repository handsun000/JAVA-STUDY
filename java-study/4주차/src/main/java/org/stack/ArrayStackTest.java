package main.java.org.stack;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ArrayStackTest {

    @Test
    @DisplayName("push 테스트")
    public void push() {
        ArrayStack arrayStack = new ArrayStack(5);

        for (int i = 0; i < arrayStack.size(); i++) {
            arrayStack.push(i+1);
        }

        assertAll(
                () -> assertEquals(arrayStack.peek(), arrayStack.size()),
                () -> assertEquals(arrayStack.search(2), 1)
        );
    }

    @Test
    @DisplayName("pop 테스트")
    public void pop() {
        ArrayStack arrayStack= new ArrayStack(5);

        for (int i = 0; i < arrayStack.size(); i++) {
            arrayStack.push(i+1);
        }

        assertAll(
                () -> assertEquals(arrayStack.pop(), 5),
                () -> assertEquals(arrayStack.peek(), 4)
        );
    }
}
