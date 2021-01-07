package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sP) {
        Salesperson top = sP.get(0);
        for (Salesperson s: sP) {
            if (s.getAmount() > top.getAmount()) {
                top = s;
            }
        }
        return top;
    }
}
