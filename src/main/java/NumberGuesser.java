package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Random feladat = new Random();
        Scanner szkenner= new Scanner(System.in);
        int feladat1= feladat.nextInt(100)+1;
        System.out.println("Gondoltam egy számra 1 és 100 között, találd ki max. 6 lépésből");
        int tipp=0;
        int x = 1;
        while (tipp != feladat1) {
            if (x>5) {
                System.out.println(("Sajna vesztettél..."));
                break;
            }
            tipp = szkenner.nextInt();
            szkenner.nextLine();
            if (tipp == feladat1) {
                System.out.println("Gratulálok, eltaláltad!");
            } else{
                if (tipp<feladat1) {
                    System.out.println("Nagyobbra gondoltam.");
                } else{
                    System.out.println("Kisebbre gondoltam.");

                }
                tipp = 0;
            }
            x++;
        }
    }
}
