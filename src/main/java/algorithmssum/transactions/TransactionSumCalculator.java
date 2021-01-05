package algorithmssum.transactions;

import algorithmssum.sales.Salesperson;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumCredit = 0;
        for (Transaction t: transactions) {
            if (t.isCredit()) {
                sumCredit += t.getAmount();
            }
        }
        return  sumCredit;    }
}
