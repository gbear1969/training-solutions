package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException();
        }
        this.accounts = new ArrayList<>(List.copyOf(accounts));
    }

    public double deposit(String accountNumber, double amount) {
        if (accountNumber == null) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
        }
        for (Account a: accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                try {
                    return a.deposit(amount);
                } catch (InvalidBankOperationException ibo) {
                    throw ibo;
                }
            }

        }
        throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
    }

    public double payment(String accountNumber, double amount) {
        if (accountNumber == null) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
        }
        for (Account a: accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                try {
                    return a.subtract(amount);
                } catch (InvalidBankOperationException ibo) {
                    throw ibo;
                }
            }

        }
        throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);
    }

    public List<Account> getAccounts() {
        return List.copyOf(accounts);
    }
}
