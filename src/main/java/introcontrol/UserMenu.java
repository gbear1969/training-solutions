package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása" + "\n" + "2. Felhasználó felvétele" + "\n" + "Többi: Kilépés");
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + "Kérek egy számot!");
        int szam = scan.nextInt();
        scan.nextLine();
        if (szam == 1) {
            System.out.println("Felhasználók listázása");
        } else {
            if (szam == 2) {
                System.out.println("Felhasználók felvétele");
            }
        }
    }
}
