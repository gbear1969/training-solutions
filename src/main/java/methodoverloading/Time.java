package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public Time(int hours) {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(Time time) {
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }

    public int mo() {
        return (int) (hours * 1e4 + minutes * 1e2 + seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        return mo() == time.mo();
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return isEqual(new Time(hours, minutes, seconds));
    }

    public boolean isEarlier(Time time) {
        return mo() < time.mo();
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return isEarlier(new Time(hours, minutes, seconds));
    }
}
