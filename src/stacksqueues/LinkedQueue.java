package stacksqueues;

public class LinkedQueue<T> implements CarlQueue<T> {
    private class Node {
        T data;
        Node next;
    }
    Node head;
    Node last;



    public void enqueue(T item) {
        if(last == null){
            Node newItem = new Node();
            newItem.data = item;
            last = newItem;
            head = newItem;
        } else {
            Node newItem = new Node();
            newItem.data = item;
            last.next = newItem;
            last = newItem;
        }


    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if(head == null) {
            throw new
                    EmptyQueueException("You can't dequeue from an empty queue");
        }
        if(head == last) {
            last = null;
        }
        T dataToReturn = head.data;
        head = head.next;






        return dataToReturn;
    }

    @Override
    public T getFront() throws EmptyQueueException {
        if(head == null) {
            throw new EmptyQueueException("You can't get data from an empty queue");
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
