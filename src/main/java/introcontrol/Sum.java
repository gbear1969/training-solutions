package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kérek öt számot és megadom az összegüket!");

        int szumma = 0;
        for(int i = 1; i < 6; i++) {
            System.out.println(i + ". szám?");
            szumma = szumma + scan.nextInt();
            scan.nextLine();
        }

        System.out.println("Összesen " + szumma);
    }
}
