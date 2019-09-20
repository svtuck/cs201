package intro;

import intro.Circle;
import intro.Displayable;
import intro.Rectangle;
import intro.Square;

public class RectangleTest {


    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,2);
        r.display();

        Square s = new Square(3);

        s.setDimensions(5);
        s.display();

    }
}
