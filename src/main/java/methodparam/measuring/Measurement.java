package methodparam.measuring;

public class Measurement {
    private double[] measurement;

    public Measurement(double[] measurement) {
        this.measurement = measurement;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < measurement.length; i++) {
            if (measurement[i] > lower && measurement[i] < upper) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double min = measurement[0];
        for (double m: measurement) {
            if (m < min) {
                min = m;
            }
        }
        return min;
    }

    public double maximum() {
        double max = 0;
        for (double m: measurement) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
