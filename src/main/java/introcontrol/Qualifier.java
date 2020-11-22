package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner szken = new Scanner(System.in);

        System.out.println("Kérek egy számot!");
        int szam = szken.nextInt();
        szken.nextLine();
        if (szam > 100) {
            System.out.println("nagyobb, mint száz");
        } else {
            if (szam == 100) {
                System.out.println("száz");
            } else {
                System.out.println("kisebb, mint száz");
            }
        }
    }
}
