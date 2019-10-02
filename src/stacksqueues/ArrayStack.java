package stacksqueues;

import java.util.Arrays;
import java.util.Random;

import bags.Bag;

public class ArrayStack<T> implements CarlStack<T> {

    // Stores items
    private T[] contents;

    // Tracks how many items are in my bag
    private int count;

    public ArrayStack(int size) {
        contents =  (T[]) new Object[size];
        count = 0;

    }



    @Override
    public void push(T item) {
        //If the bag is full, return false
        if(count == contents.length) {
            contents = Arrays.copyOf(contents, contents.length + 1);
        }
        contents[count] = item;
        count++;
    }

    @Override
    public T peek()  {
        if(count == 0) {
            return null;
        }

        return contents[count-1];
    }

    @Override
    public T pop() {
        if (count == 0) {
            return null;
        }
        return contents[--count];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
