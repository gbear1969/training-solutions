package finalmodifier;

public class CircleCalculator {
    public static final double PI = 3.14;

    public double calculatePerimeter(double r) {
        return r * 2 * PI;
    }

    public double calculateArea(double r) {
        return r * r * PI;
    }
}
