package week05d04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Store store = new Store();

        System.out.println(store.addProduct(new Product("tej", 2020, 11, 1)));
        System.out.println(store.addProduct(new Product("párizsi", 2020, 12, 25)));
        System.out.println(store.addProduct(new Product("kenyér", 2020, 12, 27)));
        System.out.println(store.addProduct(new Product("párizsi", 2020, 12, 29)));
        System.out.println(store.toString());
        System.out.println(store.getNumberOfExpired());    }
}
