package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérem, adjon meg két egész számot!");
        Scanner szkenner= new Scanner(System.in);
        System.out.println("Az egyik szám:");
        int szam1 =szkenner.nextInt();
        System.out.println("A másik szám:");
        int szam2 =szkenner.nextInt();
        System.out.println(szam1+" + "+szam2);
        System.out.println(szam1+szam2);

    }

}
