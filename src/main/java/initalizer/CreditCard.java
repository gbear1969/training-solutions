package initalizer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();
    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        ACTUAL_RATES.addAll(rates);
        this.balance = Math.round(balance * getRate(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    private double getRate(Currency currency) {
        for (Rate rate: ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }

    public boolean payment(long amount, Currency currency) {
        amount = Math.round(amount * getRate(currency));
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }
}
