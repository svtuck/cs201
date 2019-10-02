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

    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        Node current = head;
        while (current != null) {
            if (current.data.equals(anEntry)) {
                frequency++;
            }
            current = current.next;
        }
        return frequency;
    }

    public boolean remove(T anEntry)
    {
        Node current = head;
        while (current != null)
        {
            // Remove by swapping first position in
            if (current.data.equals(anEntry)) {
                current.data = head.data;
                head = head.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
