package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator cC = new CircleCalculator();
        System.out.println("A kör kerülete: " + cC.calculatePerimeter(10));
        System.out.println("A kör területe: " + cC.calculateArea(10));

        CylinderCalculator cyC = new CylinderCalculator();
        System.out.println("A henger térfogata : " + cyC.calculateVolume(5 , 10));
        System.out.println("A henger felülete: " + cyC.calculateSurfaceArea(5, 10));
        System.out.println("A Pi értéke: " + CircleCalculator.PI);

        CylinderCalculatorBasedOnCircle cCBOC = new CylinderCalculatorBasedOnCircle();
        System.out.println("A henger térfogata : " + cCBOC.calculateVolume(5,10));
        System.out.println("A henger felülete: " + cCBOC.calculateSurfaceArea(5,10));

    }
}
