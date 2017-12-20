import com.codecool.krk.model.Rectangle;
import com.codecool.krk.model.Square;
import service.RectangleTransformationService;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,8);
        Rectangle s = new Square(5);
        System.out.println("#######");
        System.out.println("Rectangle " +  r.getWidth() + " x " + r.getHeight());
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Square area: " + s.getArea());

        RectangleTransformationService rts = new RectangleTransformationService();
        rts.stretchPreservingArea(r, 2);
        System.out.println("#######");
        System.out.println("Rectangle " +  r.getWidth() + " x " + r.getHeight());
        System.out.println("Rectangle area: " + r.getArea());

        rts.stretchPreservingArea(s, 2);
        System.out.println("#######");
        System.out.println("Square " +  s.getWidth() + " x " + s.getHeight());
        System.out.println("Square area: " + s.getArea());

    }
}
