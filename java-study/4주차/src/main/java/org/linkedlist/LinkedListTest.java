package main.java.org.linkedlist;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList();
    }

    @DisplayName("add 테스트")
    @Test
    void add() {
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        assertAll(
                () -> assertEquals(linkedList.size(), 3),
                () -> assertEquals(linkedList.indexOf(1), 2),
                () -> assertEquals(linkedList.indexOf(2), 4)
        );
    }

    @DisplayName("delete 테스트")
    @Test
    void delete() {
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        linkedList.remove(2);

        assertEquals(2, linkedList.size());
        assertThrows(IllegalArgumentException.class, () -> linkedList.indexOf(3));
    }

    @DisplayName("Iterator 테스트")
    @Test
    void iterator() {
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        LinkedList.ListIterator Iterator = linkedList.listIterator();

        assertAll(

        );

    }
}
