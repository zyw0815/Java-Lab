public class TestTwoDShape {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, "red", true);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());

        Rectangle r = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());

        Square s = new Square(3.0, "green", true);
        System.out.println("Square area: " + s.getArea());
        System.out.println("Square perimeter: " + s.getPerimeter());
        System.out.println("Square color: " + s.getColor());
    }
}
