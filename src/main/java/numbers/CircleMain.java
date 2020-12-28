package numbers;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiszámolom két kör kerületét és területét.");
        System.out.println("Kérem adja meg az első kör átmérőjét (egész szám)!");
        Circle c1 = new Circle(sc.nextInt());
        sc.nextLine();

        System.out.println("Kérem adja meg a második kör átmérőjét (egész szám)!");
        Circle c2 = new Circle(sc.nextInt());
        sc.nextLine();

        System.out.println("Az első kör kerülete : " + (Math.round(c1.perimeter() * 100)) / 100.0);
        System.out.println("Az első kör területe : " + (Math.round(c1.area() * 100)) / 100.0);
        System.out.println("A második kör kerülete : " + (Math.round(c2.perimeter() * 100)) / 100.0);
        System.out.println("A második kör területe : " + (Math.round(c2.area() * 100)) / 100.0);
    }
}
