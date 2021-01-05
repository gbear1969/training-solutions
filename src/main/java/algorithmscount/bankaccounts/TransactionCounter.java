package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> ts, int max) {
        int count = 0;
        for (Transaction t: ts) {
            if (t.getAmount() < max) {
                count++;
            }
        }
        return count;
    }
}
