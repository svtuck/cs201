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
    }

    @Override
    public T peek() {
        if(head == null){
            return null;
        }
        return head.data;
    }

    @Override
    public T pop() {
        return null;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        else {
            return false;
        }
    }


}
