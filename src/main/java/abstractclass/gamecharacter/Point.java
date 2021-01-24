package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance (Point point) {
        return (long) (Math.hypot(point.getX() - x, point.getY() - y) + 0.5);
    }
}
