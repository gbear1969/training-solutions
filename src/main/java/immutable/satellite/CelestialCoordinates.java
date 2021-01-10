package immutable.satellite;

public class CelestialCoordinates {

    private final long X;
    private final long Y;
    private final long Z;

    public CelestialCoordinates(long x, long y, long z) {
        X = x;
        Y = y;
        Z = z;
    }

    public long getX() {
        return X;
    }

    public long getY() {
        return Y;
    }

    public long getZ() {
        return Z;
    }

    public String toString() {
        return "CelestialCoordinates: x=" + X + ", y=" + Y + ", z=" + Z;
    }
}
