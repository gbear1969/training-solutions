package enumtype.week;

public class WorkdayCalculatorMain {
    public static void main(String[] args) {
        WorkdayCalculator calc = new WorkdayCalculator();

        System.out.println(calc.dayTypes(Day.THURSDAY, 1));
        System.out.println(calc.dayTypes(Day.THURSDAY, 4));
        System.out.println(calc.dayTypes(Day.THURSDAY, 5));
        System.out.println(calc.dayTypes(Day.THURSDAY, 11));
    }
}
