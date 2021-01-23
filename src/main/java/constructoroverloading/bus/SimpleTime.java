package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;
    private SimpleTime time;

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public SimpleTime getTime() {
        return time;
    }

    public int difference(SimpleTime time) {
        return (hours * 60 + minutes) - (time.getHours() * 60 + time.getMinutes());
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
