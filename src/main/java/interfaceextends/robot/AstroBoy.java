package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    private Point position;
    private int angle = 0;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public long getAltitude() {
        return position.getZ();
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public void liftTo(long altitude) {
        position = new Point(this.position.getX(), this.position.getY(), altitude);
        path.add(position);
    }

    public void flyTo(Point position) {
        this.position = position;
        path.add(position);
    }

    public void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(new Point(position.getX(), position.getY(), ALTITUDE));
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return new ArrayList<>(List.copyOf(path));
    }
}
