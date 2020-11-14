package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);

        System.out.println("Kérem, adja meg az egyik bankszámla számát!");
        String accountNumber = szkenner.nextLine();
        System.out.println("Kérem, adja meg a bankszámla tulajdonosának nevét!");
        String owner = szkenner.nextLine();
        System.out.println("Kérem, adja meg a bankszámla egyenlegét!");
        int balance = szkenner.nextInt();
        szkenner.nextLine();
        BankAccount account1 = new BankAccount(accountNumber, owner, balance);

        System.out.println(account1.getInfo());

        System.out.println("Kérem, adja meg a másik bankszámla számát!");
        accountNumber = szkenner.nextLine();
        System.out.println("Kérem, adja meg a bankszámla tulajdonosának nevét!");
        owner = szkenner.nextLine();
        System.out.println("Kérem, adja meg a bankszámla egyenlegét!");
        balance = szkenner.nextInt();
        szkenner.nextLine();
        BankAccount account2 = new BankAccount(accountNumber, owner, balance);

        System.out.println(account2.getInfo());

        System.out.println("Mennyi pénzt szeretne betenni " + account1.getOwner() + " számlájára?");
        account1.deposit(szkenner.nextInt());
        szkenner.nextLine();
        System.out.println(account1.getInfo());

        System.out.println("Mennyi pénzt szeretne felvenni " + account2.getOwner() + " számlájáról?");
        account2.withdraw(szkenner.nextInt());
        szkenner.nextLine();
        System.out.println(account2.getInfo());

        System.out.println("Mennyi pénzt szeretne átutalni " + account2.getOwner() + " számlájáról " + account1.getOwner() + " számlájára?");
        account2.transfer(account1, szkenner.nextInt());
        szkenner.nextLine();
        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

    }
}
