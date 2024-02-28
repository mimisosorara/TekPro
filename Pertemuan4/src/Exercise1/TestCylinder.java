package Exercise1;

public class TestCylinder {
    public static void main (String[] args){
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Exercise1.Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getVolume()/c1.getHeight()
                + " volume=" + c1.getVolume()
                + " surface area=" + c1.getArea());
        System.out.println(c1);
        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Exercise1.Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getVolume()/c2.getHeight()
                + " volume=" + c2.getVolume()
                + " surface area=" + c2.getArea());
        System.out.println(c2);
        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Exercise1.Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getVolume()/c3.getHeight()
                + " volume=" + c3.getVolume()
                + " surface area=" + c3.getArea());
        System.out.println(c3);
    }
}
