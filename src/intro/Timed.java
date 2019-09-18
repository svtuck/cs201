package intro;

public class Timed {

    int a;

    public static Timed addMe(Timed timed) {
        timed.a++;
        return timed;

    }


    public static void main(String[] args) {
        Timed first = new Timed();
        first.a = 5;
        Timed second = addMe(first);
        System.out.println(first.a);
        System.out.println(second.a);
    }
}
