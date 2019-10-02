package stacksqueues;

interface CarlStack<T> {
    void push(T item);
    T peek();
    T pop();
    boolean isEmpty();
}
