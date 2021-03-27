package ioreadwritebytes;

public class Temperatures {
    private final byte[] DATA;

    public Temperatures(byte[] data) {
        this.DATA = data;
    }

    public byte[] getData() {
        return DATA;
    }

    private double getAverege(int days) {
        double sum = 0;
        for (int i = 1; i <= days; i++) {
            sum += DATA[DATA.length - i];
        }
        return sum / days;
    }

    public double getYearAverage(){
        return getAverege(DATA.length);
    }

    public double getMonthAverage(){
        return getAverege(30);
    }
}
