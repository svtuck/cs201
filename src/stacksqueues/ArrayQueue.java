package stacksqueues;

import java.util.ArrayList;

public class ArrayQueue<T> implements CarlQueue<T> {

    public T[] queue;
    private static final int DEFAULT_CAPACITY = 20;
    private int front;
    private int rear;

    public                                                                                                                                                                                                                                                                                                                                      ArrayQueue() {
        queue = (T[])new Object[DEFAULT_CAPACITY];;
        front = 0;
        rear = 0;
    }

    private boolean isFull() {
        return ((rear + 1) % queue.length == front);
    }

    public boolean isEmpty() {
        return (rear == front);
    }

    public T getFront() {
        if (!isEmpty()) {
            return queue[front];
        }
        else {
            return null;
        }
    }

    public void enqueue(T item) {
        if (isFull()) {
            T[] biggerQueue = (T[])new Object[queue.length * 2];
            for (int i=0; i < queue.length; i++) {
                biggerQueue[i] = queue[(front + i) % queue.length];
            }
            rear = queue.length - 1;
            front = 0;
            queue = biggerQueue;
        }

        queue[rear] = item;
        rear = (rear+1) % queue.length;

    }

    public T dequeue() {
        if (!isEmpty()) {
            T itemToRemove = queue[front];
            front = (front + 1) % queue.length;
            return itemToRemove;
        }
        else {
            return null;
        }
    }


}