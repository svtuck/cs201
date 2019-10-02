package stacksqueues;

import java.util.Arrays;
import java.util.Random;

import bags.Bag;

public class ArrayStack<T> implements CarlStack<T> {

    // Stores items
    private T[] contents;

    // Tracks how many items are in my stack
    private int count;

    public ArrayStack(int size) {
        contents =  (T[]) new Object[size];
        count = 0;

    }



    @Override
    public void push(T item) {
        if(count == contents.length) {
            contents = Arrays.copyOf(contents, contents.length + 1);
        }
        contents[count] = item;
        count++;
    }

    @Override
    public T peek() throws EmptyStackException {
        if(count == 0) {
            throw new EmptyStackException("You can't peek at an empty stack");
        }

        return contents[count - 1];
    }

    @Override
    public T pop() throws EmptyStackException {
        if( count == 0) {
            throw new EmptyStackException("You can't pop from an empty stack");
        }
        T dataToReturn = contents[count - 1];
        count = count - 1;
        return dataToReturn;

    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
