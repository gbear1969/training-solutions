package controlselection.month;

public class DayInMonth {
    public int numberOfDays(int year, String month) {
        int leap = 0;


        switch (month.toLowerCase()) {
            case "február":
                if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0 && year % 100 ==00)) {
                    leap = 1;
                }
                return 28 + leap;

            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
                return 31;

            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;

            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}
