package bags;

public class RecursiveBag<T> implements Bag<T> {

    T data = null;

    RecursiveBag<T> nextBag;


    @Override
    public boolean add(T s) {
        if(data == null) {
            data = s;
        } else {
            nextBag.add(s);
        }
        return true;
    }

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public int getFrequencyOf(T s) {
        return 0;
    }

    @Override
    public boolean remove(T s) {
        return false;
    }
}
