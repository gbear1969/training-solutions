package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> lista = new ArrayList<>();

    public void addProduct(Product product) {
        if (egyedi(product) && fogyaszthato(product)) {
            lista.add(product);
        } else {
            System.out.println("A(z) " + product.getName() + " megnevezésű, " + product.getEnd() +
                    "-ig fogyasztható termék nem adható a raktárhoz, mert már van ilyen termék, vagy lejárt a szavatossága!");
        }
    }

    public int getNumberOfExpired() {
        int db = 0;
        for (Product product1 : lista) {
            if (!fogyaszthato(product1)) {
                db++;
            }
        }
        return db;
    }

    public boolean egyedi(Product product) {
        boolean joNev = true;
        for (Product raktaron : lista) {
            if (product.getName().equalsIgnoreCase(raktaron.getName())) {
                joNev = false;
            }
        }
        return joNev;
    }

    public boolean fogyaszthato(Product product2) {
       return LocalDate.now().isBefore(product2.getEnd());
    }
}
