package bags;

public class LinkedBag <T> implements Bag<T> {

    private class Node {
        T data;
        Node next;
    }

    Node head;

    public LinkedBag() {
        this.head = null;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean add(T newEntry) {
        Node newItem = new Node();
        newItem.next = head;
        head = newItem;
        newItem.data = newEntry;
        return true;

    }

    public int getCurrentSize() {
        int size = 0;

        Node current = head;

        while(current != null ) {
            size++;
            current = current.next;
        }
        return size;
    }
}
