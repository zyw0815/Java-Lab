public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return width; }
    public void setSide(double side) {
        width = side;
        height = side;
    }

    // getArea() and getPerimeter() inherited from Rectangle work correctly
}
