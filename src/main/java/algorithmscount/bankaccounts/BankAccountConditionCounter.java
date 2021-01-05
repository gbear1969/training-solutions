package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bAL, int minB) {
        int count = 0;
        for (BankAccount a: bAL) {
            if (a.getBalance() > minB) {
                count++;
            }
        }
        return count;
    }
}
