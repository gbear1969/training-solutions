package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int hely = 10;
        int hajo = 3;
        String kint = "Elvitték a(z) ";
        Scanner scan = new Scanner(System.in);

        System.out.println("Mekkora a csoport létszáma?");
        int tag = scan.nextInt();
        scan.nextLine();

        if (tag >= 4) {
            kint = kint + 5;
            tag = tag - 5;
            hajo--;
            hely = hely-5;
            if (tag > 3) {
                kint = kint + ", ";
            } else {
                if (tag > 0) {
                    kint = kint + " és ";
                }

            }
        }

        if (tag >= 3) {
            kint = kint + 3;
            tag = tag - 3;
            hajo--;
            hely = hely - 3;
            if (tag > 0) {
                kint = kint + " és ";
            }
        }

        if (tag > 0) {
            kint = kint + 2;
            tag = tag - 2;
            hajo--;
            hely = hely -2;
        }

        kint = kint + " fős hajót.";

        if (hajo < 3) {
            System.out.println(kint);
        }

        if (hajo > 0) {
            System.out.println("Maradt még " + hajo + " db hajó " + hely + " szabad hellyel.");
        }

        if (tag > 0) {
            System.out.println("Még " + tag + " fő maradt a parton.");
        }
    }
}
