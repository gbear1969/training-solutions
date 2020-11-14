package statements;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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

    public int getInMinutes() {
        return getHours() * 60 + getMinutes();
    }

    public int getInSeconds() {
        return getInMinutes() * 60 + getSeconds();
    }

    public boolean earlierThan(Time other) {
        return this.getInSeconds() < other.getInSeconds();
    }

    public String toString(){
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }
}
