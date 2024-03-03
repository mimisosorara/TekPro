package Exercise2;

public class TestShape {
    public static void main (String[] args) {
        Shape s1 = new Shape();
        System.out.println("Exercise2.Shape:"
                + " color=" + s1.getColor()
                + " filled=" + s1.isFilled());
        System.out.println(s1);
        System.out.println();
        Shape s2 = new Shape("red",true);
        System.out.println("Exercise2.Shape:"
                + " color=" + s2.getColor() + " filled=" + s2.isFilled());
        System.out.println(s2);
        System.out.println();
        Shape s3 = new Shape("white",false);
        System.out.println("Exercise2.Shape:"
                + " color=" + s3.getColor()
                + " filled=" + s3.isFilled());
        System.out.println(s3);
        System.out.println();
        Circle c1 = new Circle();
        System.out.println("Exercise2.Circle:"
                + " radius=" + c1.getRadius()
                + " area=" + c1.getArea()
                + " perimeter=" + c1.getPerimeter()
                + " color=" + c1.getColor()
                + " filled=" + c1.isFilled());
        System.out.println(c1);
        System.out.println();
        Circle c2 = new Circle(2.0);
        System.out.println("Exercise2.Circle:"
                + " radius=" + c2.getRadius()
                + " area=" + c2.getArea()
                + " perimeter=" + c2.getPerimeter()
                + " color=" + c2.getColor()
                + " filled=" + c2.isFilled());
        System.out.println(c2);
        System.out.println();
        Circle c3 = new Circle(2.0,"white",false);
        System.out.println("Exercise2.Circle:"
                + " radius=" + c3.getRadius()
                + " area=" + c3.getArea()
                + " perimeter=" + c3.getPerimeter()
                + " color=" + c3.getColor()
                + " filled=" + c3.isFilled());
        System.out.println(c3);
        System.out.println();
        Rectangle r1 = new Rectangle();
        System.out.println("Exercise2.Rectangle:"
                + " width=" + r1.getWidth()
                + " length=" + r1.getLength()
                + " area=" + r1.getArea()
                + " perimeter=" + r1.getPerimeter()
                + " color=" + r1.getColor()
                + " filled=" + r1.isFilled());
        System.out.println(r1);
        System.out.println();
        Rectangle r2 = new Rectangle(2.0,3.0);
        System.out.println("Exercise2.Rectangle:"
                + " width=" + r2.getWidth()
                + " length=" + r2.getLength()
                + " area=" + r2.getArea()
                + " perimeter=" + r2.getPerimeter()
                + " color=" + r2.getColor()
                + " filled=" + r2.isFilled());
        System.out.println(r2);
        System.out.println();
        Rectangle r3 = new Rectangle("red",false,2.0,3.0);
        System.out.println("Exercise2.Rectangle:"
                + " width=" + r3.getWidth()
                + " length=" + r3.getLength()
                + " area=" + r3.getArea()
                + " perimeter=" + r3.getPerimeter()
                + " color=" + r3.getColor()
                + " filled=" + r3.isFilled());
        System.out.println(r3);
        System.out.println();
        Square q1 = new Square();
        System.out.println("Exercise2.Square:"
                + " side=" + q1.getSide()
                + " area=" + q1.getArea()
                + " perimeter=" + q1.getPerimeter()
                + " color=" + q1.getColor()
                + " filled=" + q1.isFilled());
        System.out.println(q1);
        System.out.println();
        Square q2 = new Square(4.0);
        System.out.println("Exercise2.Square:"
                + " side=" + q2.getSide()
                + " area=" + q2.getArea()
                + " perimeter=" + q2.getPerimeter()
                + " color=" + q2.getColor()
                + " filled=" + q2.isFilled());
        System.out.println(q2);
        System.out.println();
        Square q3 = new Square(4.0,"purple",false);
        System.out.println("Exercise2.Square:"
                + " side=" + q3.getSide()
                + " area=" + q3.getArea()
                + " perimeter=" + q3.getPerimeter()
                + " color=" + q3.getColor()
                + " filled=" + q3.isFilled());
        System.out.println(q3);
        System.out.println();
    }
}
