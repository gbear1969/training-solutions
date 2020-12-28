package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dT = new ArrayList<>();
        Day day = firstDay;
        for (int i = 0; i < numberOfDays; i++) {
            dT.add(day.getDayType());
            day = nextDay(day);
        }
        return dT;
    }

    private Day nextDay(Day day) {
        return day.ordinal() == 6 ? Day.values()[0] : Day.values()[day.ordinal() + 1];
    }
}
