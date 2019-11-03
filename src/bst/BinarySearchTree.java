package bst;

public class ReservationBinarySearchTree {

    static class Reservation {

        double time;
        String name;

        public Reservation(double t, String n) {
            time = t;
            name = n;
        }

        public String toString() {
            return time + " " + name;
        }
    }


    private Reservation data;
    private double key;

    private ReservationBinarySearchTree left;
    private ReservationBinarySearchTree right;




    public boolean insert(Reservation r) {
        return insert(r.time, r);
    }


    public boolean insert(double k, Reservation r) {
        if(this.data == null) {
            this.data = r;
            this.key = k;
            return true;
        }


        if(Math.abs(this.key -k) < 1) {
            return false;
        }

        if(k < this.key) {
            if(left == null) {
                left = new ReservationBinarySearchTree();
            }
            return left.insert(k, r);
        }
        else {
            if(right == null) {
                right = new ReservationBinarySearchTree();
            }
            return right.insert(k, r);
        }

    }

    public void inOrder() {
        if(left != null){
            left.inOrder();
        }
        System.out.println(data);
        if(right != null){
            right.inOrder();
        }
    }

    public void display(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(data);
        if(left != null){
            left.display(depth+1);
        }
        if(right != null){
            right.display(depth+1);
        }
    }



    public static void main(String[] args) {

        ReservationBinarySearchTree tree = new ReservationBinarySearchTree();
        tree.insert(new Reservation(11, "Sam"));

        System.out.println(tree.insert(new Reservation(13, "Dave")));
        System.out.println(tree.insert(new Reservation(9, "Sneha")));
        System.out.println(tree.insert(new Reservation(10, "Layla")));


        tree.inOrder();
        // tree.display(0);

        //tree.insert(new Reservation(8.5, "Joe"));

    }

}
