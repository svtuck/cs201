package stacksqueues;

public interface CarlStack<T> {
    void push(T item);
    T peek() throws EmptyStackException;
    T pop() throws EmptyStackException;
    boolean isEmpty();
}
