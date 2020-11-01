package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Kérem, adja meg a nevét!");
        Scanner szkenner= new Scanner(System.in);
        String neve=szkenner.nextLine();
        System.out.println("Kérem, adja meg az e-mail címét!");
        String mail=szkenner.nextLine();
        System.out.println("Az alábbi adatokat adta meg:");
        System.out.println("Neve: " + neve);
        System.out.println("E-mail címe: " + mail);
    }
}
