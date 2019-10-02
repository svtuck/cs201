package stacksqueues;

import bags.Bag;

public class LinkedStack<T> implements CarlStack<T> {

    private class Node {
        T data;
        Node next;
    }

    Node head;

    public LinkedStack() {
        this.head = null;
    }

    @Override
    public void push(T item) {
        Node newItem = new Node();
        newItem.next = head;
        head = newItem;
        newItem.data = item;

    }

    @Override
    public T peek() throws EmptyStackException {
        if(head == null) {
            throw new EmptyStackException("Tried to peek from empty stack");
        }
        return head.data;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(head == null) {
            throw new EmptyStackException("Tried to pop from empty stack");
        }
        T data = head.data;
        head = head.next;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }


}
