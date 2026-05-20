public abstract class TwoDShape {
    protected String color;
    protected boolean filled;

    public TwoDShape() {
        color = "white";
        filled = false;
    }

    public TwoDShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea();
    public abstract double getPerimeter();
}
