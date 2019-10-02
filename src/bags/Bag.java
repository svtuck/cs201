package bags;

public interface Bag<T> {

    public boolean add(T s);
    public int getCurrentSize();
    public int getFrequencyOf(T s);
    // public T grab();
    public boolean remove(T s);


}
