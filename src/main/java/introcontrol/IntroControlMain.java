package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl kontroll = new IntroControl();
        System.out.println(kontroll.subtractTenIfGreaterThanTen(10));
        System.out.println(kontroll.subtractTenIfGreaterThanTen(11));
        System.out.println();
        System.out.println(kontroll.describeNumber(0));
        System.out.println(kontroll.describeNumber(2));
        System.out.println();
        System.out.println(kontroll.greatingToJoe("Joe"));
        System.out.println(kontroll.greatingToJoe("Joan"));
        System.out.println();
        System.out.println(kontroll.calculateBonus(999999));
        System.out.println(kontroll.calculateBonus(1000005));
        System.out.println();
        System.out.println(kontroll.calculateConsumption(7000, 8000));
        System.out.println(kontroll.calculateConsumption(8000, 7000));
        System.out.println();
        kontroll.printNumbers(6);
        System.out.println();
        kontroll.printNumbersBetween(5, 9);
        System.out.println();
        kontroll.printNumbersBetweenAnyDirection(1, 4);
        System.out.println();
        kontroll.printNumbersBetweenAnyDirection(9, 5);
        System.out.println();
        kontroll.printOddNumbers(11);
        System.out.println();
        kontroll.printOddNumbers(10);
    }
}
