package algorithmsdecision.bankaccounts;

import algorithmscount.bankaccounts.TransactionType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private Status status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation,
            int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
        status = Status.CREATED;
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

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public Status getStatus() {
        return status;
    }

    public void setDateOfTransaction(LocalDateTime dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT ? true : false;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT ? true : false;
    }
}
