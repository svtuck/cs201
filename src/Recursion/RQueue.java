package Recursion;

public class RQueue<T> implements CarlQueue<T>
{
    private T front;
    private RQueue<T> inside;
    private T rear;

    @Override
    public void enqueue(T item) {

    }

    @Override
    public T getFront() {
        return null;
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public void display() {

    }

    // This method is useful for us in testing your code. Do not modify it.
    public void showImmediateContents() {
        System.out.println("Front: " + front);
        System.out.println("Inside: " + inside);
        System.out.println("Rear: " + rear);
    }


}