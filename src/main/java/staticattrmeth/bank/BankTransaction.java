package staticattrmeth.bank;

import java.math.*;

public class BankTransaction {
    public static final long MIN_VALUE = 1;
    public static final long MAX_VALUE = (long) 1e7;
    private static int trxsCount = 0;
    private static BigDecimal sumOfTrxs = new BigDecimal("0");
    private static long currentMinValue = 0;
    private static long currentMaxValue = 0;
    private long trxValue;

    public BankTransaction(long trxValue) {
        if (trxValue < MIN_VALUE || trxValue > MAX_VALUE) {
            throw new IllegalArgumentException("Nem megfelelő a tranzakció értéke!");
        }
        this.trxValue = trxValue;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal(Long.toString(trxValue)));
        if (currentMinValue == 0 || trxValue < currentMinValue) {
            currentMinValue = trxValue;
        }
        if (currentMaxValue == 0 || trxValue > currentMaxValue) {
            currentMaxValue = trxValue;
        }
        trxsCount++;
    }

    public static void initTheDay() {
        trxsCount = 0;
        sumOfTrxs = new BigDecimal("0");
        currentMinValue = 0;
        currentMaxValue = 0;
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static BigDecimal averageOfTransaction() {
        return sumOfTrxs.divide(new BigDecimal(Integer.toString(trxsCount)));
    }

    public long getTrxValue() {
        return trxValue;
    }
}
