package defaultconstructor.date;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! " +
                    year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect (int year, int month, int day) {
        return year < 1900 || month < 1 || month > 12 || day < 1 || day > calculateMonthLength(year, month);
    }

    private boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            }
        }
        return false;
    }

    private int calculateMonthLength(int year, int month) {
        int maxDay = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 28;
                if (isLeapYear(year)) {
                    maxDay ++;
                }
        }
        return maxDay;
    }
}
