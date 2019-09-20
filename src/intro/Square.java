package intro;

public class Square extends Rectangle {

    public Square(int w) {
        super(w, w);
    }

    public void display() {
        System.out.println("The square has width " + getWidth() + " height " + getHeight());
    }

    public void setDimensions(int w, int h) {
        if(w != h) {
            throw new RuntimeException("This is a square");
        }
        super.setDimensions(w,h);
    }

    public void setDimensions(int w) {
        super.setDimensions(w,w);
    }

}
