package test.java;

import main.java.org.linkedlist.LinkedList;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList linkedList;

    @DisplayName("add 테스트")
    @Test
    public void add() {
        linkedList = new LinkedList();
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        assertAll(
                () -> assertEquals(linkedList.size(), 3),
                () -> assertEquals(linkedList.indexOf(1), 0),
                () -> assertEquals(linkedList.indexOf(2), 4)
        );
    }

    @DisplayName("delete 테스트")
    @Test
    public void delete() {
        linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        linkedList.remove(2);

        assertEquals(2, linkedList.size());
        assertThrows(IllegalArgumentException.class, () -> linkedList.indexOf(3));
    }

    @DisplayName("Iterator 테스트")
    @Test
    public void iterator() {
        linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        LinkedList.ListIterator iterator = linkedList.listIterator();

        assertAll(
                () -> assertEquals(linkedList.get(0), iterator.next()),
                () -> assertEquals(linkedList.get(1), iterator.next()),
                () -> assertTrue(iterator.hasNext()),
                () -> assertEquals(linkedList.get(2), iterator.next()),
                () -> assertTrue(iterator.hasNext())
        );
    }
}
