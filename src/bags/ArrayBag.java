package bags;

public class ArrayBag implements Bag {

    // Stores strings
    private String[] contents;

    // Tracks how many strings are in my bag
    private int count;

    public ArrayBag(int size) {
        contents = new String[size];
        count = 0;
    }

    public boolean add(String s){
        //If the bag is full, return false

        if(count == contents.length) {
            return false;
        }

        contents[count] = s;

        count++;

        return true;
    }


    public int getCurrentSize(){
        return count;
    }

    public int getFrequencyOf(String s) {
        int x = 0;
        for(int i = 0; i < count; i++ ) {
            if(contents[i].equals(s)) {
                x+=1;
            }
        }
        return x;
    }

    public String getImplementationName() {
        return "ArrayBag";
    }
}
