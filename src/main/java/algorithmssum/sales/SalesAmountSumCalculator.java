package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> spl) {
        int sum = 0;
        for (Salesperson sp: spl) {
            sum += sp.getAmount();
        }
        return  sum;
    }
}
