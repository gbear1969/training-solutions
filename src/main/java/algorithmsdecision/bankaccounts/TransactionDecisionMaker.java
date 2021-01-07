package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {
    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions,
        LocalDateTime startTime, LocalDateTime endTime, int limit) {
        for (Transaction t: transactions) {
            if (t.isDebit() && t.getDateOfTransaction().isAfter(startTime)
                && t.getDateOfTransaction().isBefore(endTime) && t.getAmount() > limit) {
                return true;
            }
        }
        return false;
    }
}
