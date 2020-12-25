package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    CircleCalculator cC = new CircleCalculator();

    public double calculateVolume(double r, double h) {
        return cC.calculateArea(r) * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        return cC.calculateArea(r) * 2 + cC.calculatePerimeter(r) * h;
    }

}
