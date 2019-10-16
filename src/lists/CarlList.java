package lists;

public interface CarlList<T> {
    void add(T newEntry);
    void add(int position, T newEntry);
    T getEntry(int position);
    T remove(int position); // returns object at that position
    int size();
}