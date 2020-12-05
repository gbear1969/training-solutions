package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int counterProducts(Category kategoria) {
        int count = 0;

        for (Product p : products) {
            if (kategoria == p.getKategoria()) {
                count++;
            }
        }

        return count;
    }
}
