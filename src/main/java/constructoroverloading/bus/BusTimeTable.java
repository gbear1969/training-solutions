package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = firstHour; i <= lastHour; i++) {
            timeTable.add(new SimpleTime(i, everyMinute));
        }
    }

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable.addAll(timeTable);
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        SimpleTime next = null;
        for (SimpleTime t: timeTable) {
            if (t.difference(actual) >= 0 && (next == null || next.difference(t) > 0)) {
                next = t;
            }
        }
        if (next == null) {
            throw new IllegalStateException("No more buses today!");
        }

        return next;
    }

    public SimpleTime firstBus() {
        return nextBus(new SimpleTime(0));
    }
}
