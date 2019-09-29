package bags;

import java.util.Arrays;
import java.util.Random;

public class ArrayBag<T> implements Bag<T> {

    // Stores items
    private T[] contents;

    // Tracks how many items are in my bag
    private int count;

    public ArrayBag(int size) {
        contents =  (T[]) new Object[size];
        count = 0;

    }

    public boolean add(T s){
        //If the bag is full, return false
        if(count == contents.length) {
           contents = Arrays.copyOf(contents, contents.length + 1);
        }
        contents[count] = s;
        count++;
        return true;
    }

    public int getCurrentSize(){
        return count;
    }

    // Returns the frequency of s in the bag (using .equals)
    public int getFrequencyOf(T s) {
        int x = 0;
        for(int i = 0; i < count; i++ ) {
            if(contents[i].equals(s)) {
                x+=1;
            }
        }
        return x;
    }

    public T grab() {
        if (count == 0 ) {
            return null;
        }
        int index = new Random().nextInt(count);
        T element = contents[index];
        removeAndSwap(index);
        return element;

    }

    public boolean remove(T s) {
        for(int index = 0;index < count ;index++  ) {
            if( contents[index].equals(s) ) {
                removeAndSwap(index);
                return true;
            }
        }
        return false;
    }

    private void removeAndSwap(int index) {
        contents[index] = contents[count - 1];
        count = count - 1; // count--
    }


}
