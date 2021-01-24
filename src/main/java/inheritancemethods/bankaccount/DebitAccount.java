package inheritancemethods.bankaccount;

public class DebitAccount {
    private String accountNumber;
    private long balance;
    public static final double COST = 3.0;
    public static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        return (amount * COST / 100) > MIN_COST ? (long) (amount * COST / 100) : MIN_COST;
    }

    public boolean transaction(long amount) {
        if (balance >= amount + costOfTransaction(amount)) {
            balance -= amount + costOfTransaction(amount);
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        balance = 0;
    }
}
