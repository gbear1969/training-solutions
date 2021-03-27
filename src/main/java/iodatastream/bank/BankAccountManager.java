package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount bankaccount, Path path) {
        String fileName = bankaccount.getAccountNumber() + ".dat";
        Path file = path.resolve(fileName);
        try (DataOutputStream outputStream = new DataOutputStream(
                new BufferedOutputStream(Files.newOutputStream(file)))) {
            outputStream.writeUTF(bankaccount.getAccountNumber());
            outputStream.writeUTF(bankaccount.getOwner());
            outputStream.writeDouble(bankaccount.getBalance());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public BankAccount loadAccount(InputStream is) {
        try (DataInputStream inputStream = new DataInputStream(
                new BufferedInputStream(is))) {
            String accountNumber = inputStream.readUTF();
            String ownerName = inputStream.readUTF();
            double balance = inputStream.readDouble();
            return new BankAccount(accountNumber, ownerName, balance);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
