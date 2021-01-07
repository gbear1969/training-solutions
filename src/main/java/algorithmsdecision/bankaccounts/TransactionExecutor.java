package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction t: transactions) {
            for (BankAccount a: accounts) {
                if (t.getAccountNumber().equals(a.getAccountNumber())) {
                    if (creditOrDebit(t) == TransactionOperation.CREDIT) {
                        a.deposit(t.getAmount());
                        t.setStatus(Status.SUCCEEDED);
                    } else {
                        if (a.withdraw(t.getAmount())) {
                            t.setStatus(Status.SUCCEEDED);
                        } else {
                            t.setStatus(Status.PENDING);
                        }
                    }
                    t.setDateOfTransaction(LocalDateTime.now());
                }
            }
        }
    }

    public TransactionOperation creditOrDebit(Transaction transaction) {
        return transaction.getTransactionOperation();
    }
}
