package stacksqueues;

interface CarlQueue<T> {
    void enqueue(T item); // adds at rear
    T dequeue(); // retrieves and removes from front
    T getFront(); // looks at front
    boolean isEmpty();
}
