package algorithmssum.transactions;

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT ? true : false;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT ? true : false;
    }
}
