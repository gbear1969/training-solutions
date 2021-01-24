package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {
    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        if (super.transaction(amount)) {
            return true;
        } else {
            if (getBalance() + overdraftLimit >= amount + costOfTransaction(amount)) {
                overdraftLimit += getBalance() - amount - costOfTransaction(amount);
                balanceToZero();
                return true;
            }
        }
        return false;
    }
}
