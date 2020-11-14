package statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);

        System.out.println("Befektetés összege?");
        int amount = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println("Kamatláb?");
        int interestRate = szkenner.nextInt();
        szkenner.nextLine();

        Investment intvestment = new Investment(amount, interestRate);

        System.out.println("Befektetett összeg: " + amount + ", kamatláb: " + interestRate + "%");

        System.out.println("Hány napi hozamot számoljak?");
        int days = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println(days + " napra a hozam: " + intvestment.getYield(days));

        System.out.println("Hány nap után zárjam a futamidőt?");
        days = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println(days + " nap után a kivehető összeg: " + intvestment.close(days));

        System.out.println("Hány nap után zárjam a futamidőt?");
        days = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println(days + " nap után a kivehető összeg: " + intvestment.close(days));

    }
}
