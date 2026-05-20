public class MovePoint implements Moveable {
    private int x, y;

    public MovePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp()    { y++; }
    public void moveDown()  { y--; }
    public void moveLeft()  { x--; }
    public void moveRight() { x++; }

    public int getX() { return x; }
    public int getY() { return y; }

    public static void main(String[] args) {
        MovePoint p = new MovePoint(0, 0);
        p.moveUp();
        p.moveRight();
        System.out.println("(" + p.getX() + ", " + p.getY() + ")"); // (1, 1)
    }
}
