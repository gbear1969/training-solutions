package ioreadstring.transaction;

import ioreadstring.names.Human;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void uploadListFromFile(String file) {
        try {
            List<String> accountData = Files.readAllLines(Path.of(file));
            for (String s : accountData) {
                String data[] = s.split(";");
                accountList.add(new BankAccount(data[0], data[1], Integer.parseInt(data[2])));
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't reach file!", e);
        }
    }

    public void makeTransactions(String file) {
        try {
            List<String> transactions = Files.readAllLines(Path.of(file));
            for (String t : transactions) {
                String data[] = t.split(";");
                for (BankAccount b: accountList) {
                    if (b.getAccountNumber().equals(data[0])) {
                        b.setBalance(Integer.parseInt(data[1]));
                    }
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't reach file!", e);
        }
    }


}
