package classstructureattributes;

import java.util.Scanner;

public class Clientmain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner szkenner = new Scanner(System.in);
        System.out.println("Kérem, adja meg a nevét!");
        client.name = szkenner.nextLine();
        System.out.println("Kérem, adja meg a születési évét!");
        client.year = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println("Kérem, adja meg a címét!");
        client.adress = szkenner.nextLine();
        System.out.println("Az Ön neve: " + client.name);
        System.out.println("Az Ön születési éve: " + client.year);
        System.out.println("Az Ön címe: " + client.adress);
    }

}
