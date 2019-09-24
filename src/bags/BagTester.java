package bags;


public class BagTester {

    public static void testMe(Bag b){

        // Should print 0
        System.out.println(b.getCurrentSize());

        // Add to bag, should be successful
        System.out.println(b.add("CMC"));

        // Add to bag, should be successful
        System.out.println(b.add(new String("CMC")));

        // Add to bag, should be successful
        System.out.println(b.add("Laird"));

        // Add to bag, should be successful
        System.out.println(b.add("CMC"));

        // Add to bag, should be successful
        System.out.println(b.add("CMC"));

        // Add to bag, should fail
        System.out.println(b.add("CMC"));

        // Add to bag, should fail
        System.out.println(b.add("CMC"));

        // Add to bag, should fail
        System.out.println(b.add("CMC"));

        // Should print 5
        System.out.println(b.getFrequencyOf("CMC"));



    }

    public static void main(String[] args) {

        ArrayBag b = new ArrayBag(5);

        testMe(b);


    }
}
