package bags;


import java.util.Scanner;

public class BagTester {

    public static void testMe(Bag<String> b){

        // Should print 0
        System.out.println(b.getCurrentSize());

        // Add to bag, should be successful
        System.out.println(b.add("CMC"));

        // Add to bag, should be successful
        System.out.println(b.add("CMC"));


        System.out.println(b.getFrequencyOf("CMC"));

        System.out.println(b.getCurrentSize());

        while(b.getFrequencyOf("CMC") > 0 ) {
            System.out.println(b.remove("CMC"));
        }

        System.out.println(b.getCurrentSize());


        System.out.println(b.add("CMC"));

        System.out.println(b.add("CMC"));

        System.out.println(b.add("CMC"));
        while(b.getCurrentSize() > 0 ) {
            String o = b.grab();
            o.length();
        }

        System.out.println(b.getCurrentSize());

    }

    public static void main(String[] args) {

        ArrayBag<String> b = new ArrayBag<String>(1);







        BagTimer.timeMe(b,(int) Math.pow(2, 12) + 1);


    }
}
