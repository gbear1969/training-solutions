package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg a \"(6 + 3) * 7 / (16 - 5)\" képlet eredményét (4 tizedesjegy pontossággal)!");
        double r = (6 + 3) * 7.0 / (16 - 5);
        System.out.println(((Math.abs(r - sc.nextDouble()) <= 0.0001) ?
                "A megoldás helyes, gratulálok!" : "A megoldás sajnos helytelen, próbáld újra!"));
        sc.nextLine();
    }
}
