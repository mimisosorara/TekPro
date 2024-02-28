package Exercise2;

public class TestShape {
    public static void main (String[] args) {
        Shape s1 = new Shape();
        System.out.println("Exercise2.Shape:"
                + " color=" + s1.getColor()
                + " filled=" + s1.isFilled());
        System.out.println(s1);
        Shape s2 = new Shape("red",true);
        System.out.println("Exercise2.Shape:"
                + " color=" + s2.getColor() + " filled=" + s2.isFilled());
        System.out.println(s2);
        Shape s3 = new Shape("white",false);
        System.out.println("Exercise2.Shape:"
                + " color=" + s3.getColor()
                + " filled=" + s3.isFilled());
        System.out.println(s3);
        Circle c1 = new Circle();
        System.out.println("Exercise2.Circle:"
                + " radius=" + c1.getRadius()
                + " area=" + c1.getArea()
                + " perimeter=" + c1.getPerimeter()
                + " color=" + c1.getColor()
                + " filled=" + c1.isFilled());
        System.out.println(c1);
        Circle c2 = new Circle(2.0);
        System.out.println("Exercise2.Circle:"
                + " radius=" + c2.getRadius()
                + " area=" + c2.getArea()
                + " perimeter=" + c2.getPerimeter()
                + " color=" + c2.getColor()
                + " filled=" + c2.isFilled());
        System.out.println(c2);
        Circle c3 = new Circle(2.0,"white",false);
        System.out.println("Exercise2.Circle:"
                + " radius=" + c3.getRadius()
                + " area=" + c3.getArea()
                + " perimeter=" + c3.getPerimeter()
                + " color=" + c3.getColor()
                + " filled=" + c3.isFilled());
        System.out.println(c3);
        Rectangle r1 = new Rectangle();
        System.out.println("Exercise2.Rectangle:"
                + " width=" + r1.getWidth()
                + " length=" + r1.getLength()
                + " perimeter=" + c3.getPerimeter()
                + " color=" + c3.getColor()
                + " filled=" + c3.isFilled());

    }
}
