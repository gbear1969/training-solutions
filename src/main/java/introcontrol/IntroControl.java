package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number) {
        if (number > 10) {
            number = number - 10;
        }
        return number;
    }

    public String describeNumber(int number) {
        String nulla;
        if (number == 0) {
            nulla = "zero";
        } else {
            nulla = "not zero";
        }
        return nulla;
    }

    public String greatingToJoe(String name) {
        String hello = "";
        if ("Joe".equals(name)) {
            hello = "Hello Joe";
        }
        return hello;
    }

    public int calculateBonus(int sale) {
        int bonus = (int) (sale * 0.1 + 0.5);
        if (sale < 1_000_000) {
            bonus = 0;
        }
        return bonus;
    }

    public int calculateConsumption(int prev, int next) {
        if (next<prev) {
            next = next + 10000;
        }
        return  next-prev;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    void printNumbersBetweenAnyDirection(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }

        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i = i + 2) {
            System.out.println(i);
        }
    }
}

