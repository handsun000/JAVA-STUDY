package main.java.org.queue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayQueueTest {

    @Test
    @DisplayName("add 테스트")
    public void add() {
        ArrayQueue queue = new ArrayQueue();
        queue.add(1);
        assertEquals(queue.peek(), 1);
    }

    @Test
    @DisplayName("pop 테스트")
    public void pop() {
        ArrayQueue queue = new ArrayQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertAll(
                () -> assertEquals(queue.peek(), 1),
                () -> assertEquals(queue.pop(), 1),
                () -> assertEquals(queue.peek(), 2),
                () -> assertEquals(queue.pop(), 2),
                () -> assertEquals(queue.peek(), 3)
        );
    }
}
