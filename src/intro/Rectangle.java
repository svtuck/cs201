package intro;

public class Rectangle implements Displayable  {

    private int w;
    private int sum ;

    public Rectangle(int  w, int h){
        this.w = w;
        this.sum = w + h;

    }

    public void display() {
        System.out.println("The rectangle has width " + w + " height " + (this.sum - this.w));
    }

    public void setDimensions(int w, int h) {
        this.w = w;
        this.sum = h + w;
    }

    public int getHeight() {
        return this.sum - this.w;
    }

    public int getWidth() {
        return this.w;
    }

}