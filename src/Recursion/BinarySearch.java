package Recursion;

public class BinarySearch
{

    public static <T> int search(T[] items, Comparable<T> target, int first, int last)

    {
        int mid;
        if (first > last) // Leave this out for starters
            return -1;
        else {
            mid = (first + last) / 2;
            if (target.equals(items[mid]))
                return mid;
            else if (target.compareTo(items[mid]) < 0)
                return search(items,target,first,mid-1);
            else
                return search(items,target,mid+1,last);
        }
    }

    public static void main(String[] args)
    {
        String[] stuff = {"apple","car","ice cream","mildew","xylophone"};
        int spot = search(stuff,"foo",0,stuff.length-1);
        System.out.println(spot);
    }
}
