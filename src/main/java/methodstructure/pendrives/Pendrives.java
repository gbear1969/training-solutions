package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public  Pendrive best(List<Pendrive> ps) {
        Pendrive top = null;
        for (Pendrive p: ps) {
            if (top == null || top.price / top.capacity >= p.price / p.capacity) {
                top = p;
            }
        }
        return top;
    }

    public Pendrive cheapest(List<Pendrive> ps) {
        Pendrive top = null;
        for (Pendrive p: ps) {
            if (top == null || top.price >= p.price) {
                top = p;
            }
        }
        return top;
    }

    public void risePriceWhereCapacity(List<Pendrive> ps, int percent, int capacity) {
        for (Pendrive p : ps) {
            if (p.capacity == capacity) {
                p.risePrice(percent);
            }
        }
    }
}
