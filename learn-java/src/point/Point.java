package point;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int xB, int yB) {
        int xA = getX();
        int yA = getY();
        return Math.sqrt( (double)((xB-xA)*(xB-xA)) + (double)((yB-yA)*(yB-yA)) );
    }

    public double distance(Point p) {
        return distance(p.getX(),p.getY());
    }

}
