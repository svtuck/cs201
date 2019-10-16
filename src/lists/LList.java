package lists;

public class LList< T >{


    private  class Node<T> {
        T data;
        Node<T> next;

        public Node() {
            data = null;
            next = null;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head;
    private int size;

    public void add(int index, T item) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            head = new Node<T>(item, head);
            size++;
        } else {
            Node<T> cur = head;
            for (int i=0; i < index; i++) {
                cur = cur.next;
            }
            Node<T> added = new Node<T>(item, cur.next);
            cur.next = added;
            size++;
        }
    }



    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<T> cur = head;
            for (int i=0; i < index; i++) {
                cur = cur.next;
            }
            return cur.data;
        }
    }

    public void set(int index, T entry) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<T> cur = head;
            for (int i=0; i < index; i++) {
                cur = cur.next;
            }
            cur.data = entry;
        }
    }

    public static void test(boolean condition)
    {
        if (!condition)
        {
            throw new RuntimeException("Test failed.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Node current = head;
        for(int i = 0; i < this.size; i++) {
            sb.append(current.data);
            if(current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append(")");
        return sb.toString();

    }

    public boolean equals(Object o) {
        if(!(o instanceof LList)) {
            return false;
        }

        LList other = (LList) o;

        if(this.size != other.size) {
            return false;
        }

        Node myCurrent = this.head;
        Node otherCurrent = other.head;
        for(int i = 0; i < this.size; i++) {
            if(myCurrent == null && otherCurrent == null) {
                return true;
            }
            else {
                if(!myCurrent.data.equals(otherCurrent.data)) {
                    return false;
                } else {
                    myCurrent = myCurrent.next;
                    otherCurrent = otherCurrent.next;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String s;

        LList<String> list1 = new LList<>();
        list1.add(0,"hey");
        list1.add(0,"there");
        list1.add(1,"you");
        list1.add(2,"me");

        LList<String> list2 = new LList<String>();
        list2.add(0,"hey");
        list2.add(0,"there");
        list2.add(1,"you");
        list2.add(2,"me");


        System.out.println(list1); // tests toString method
        System.out.println(list2);


        System.out.println(list1.equals(list2));
        list2.add(2,"wheee");
        System.out.println(list1.equals(list2));


    }
}
