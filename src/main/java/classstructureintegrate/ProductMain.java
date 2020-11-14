package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner szkenner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a termék nevét!");
        String name= szkenner.nextLine();
        System.out.println("Kérem, adja meg a termék árát!");
        int price= szkenner.nextInt();
        szkenner.nextLine();

        Product termek= new Product(name, price);

        System.out.println(termek.getName() + " " + termek.getPrice() + ",- Ft");

        System.out.println("Mennyivel növeljük a termék árát?");
        termek.increasePrice(szkenner.nextInt());
        szkenner.nextLine();

        System.out.println(termek.getName() + " új ára " + termek.getPrice() + ",- Ft");

        System.out.println("Mennyivel csökkentsük a termék árát?");
        termek.decreasePrice(szkenner.nextInt());
        szkenner.nextLine();

        System.out.println(termek.getName() + " új ára " + termek.getPrice() + ",- Ft");

    }
}
