package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

        private List<Product> store = new ArrayList<>();


    public boolean addProduct(Product product1) {

        if (store.size() == 0) {
            store.add(new Product("vaj", 2020, 11, 01));
        }

        int count = 0;
            for (Product product: store) {
                if (product1.getName().equalsIgnoreCase(product.getName())) {
                    count++;
                    //break;
                }
            }

            if (!product1.getDate().isBefore(LocalDate.now()) && count == 0) {
                store.add(product1);
                return true;
            }
            return  false;
        }

        public int getNumberOfExpired() {
            int count = 0;
            for (Product product: store) {
                if (product.getDate().isBefore(LocalDate.now())) {
                    count++;
                }
            }
            return count;
        }

        public String toString() {
            String lista ="";
            for (Product p: store) {
                lista = lista + p.getName() + " (" + p.getDate() + "); ";
            }
            return lista;

        }
    }

