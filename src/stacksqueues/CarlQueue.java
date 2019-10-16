package stacksqueues;

public interface CarlQueue<T> {
    void enqueue(T item); // adds at rear
    T dequeue() throws EmptyQueueException; // retrieves and removes from front
    T getFront() throws EmptyQueueException; // looks at front
    boolean isEmpty();
}
