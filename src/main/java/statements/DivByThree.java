package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy egész számot!");
        int number = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println(number + " osztható hárommal: " + (number%3 == 0));
    }
}
