package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sP) {
        Salesperson top = sP.get(0);
        for (Salesperson s: sP) {
            if (s.getDifferenceFromTarget() < top.getDifferenceFromTarget()) {
                top = s;
            }
        }
        return top;
    }
}
