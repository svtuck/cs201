package intro;

public class Circle implements Displayable {
    public int r;
    public Circle(int r) {
        this.r = r;
    }

    public void display() {
        System.out.println("The circle has radius " + this.r);
    }
}
