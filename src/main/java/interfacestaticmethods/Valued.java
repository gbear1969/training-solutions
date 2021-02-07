package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double totalValue(List<Valued> elements) {
        double sum = 0;
        for (Valued v: elements) {
            sum += v.getValue();
        }
        return sum;
    }

}
