package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate end;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        end = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getEnd() {
        return end;
    }

    public String toString() {
        return "Raktáron: " +
                "termék: " + name + ", fogyasztható = " + end;
    }
}
