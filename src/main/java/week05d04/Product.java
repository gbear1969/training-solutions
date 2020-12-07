package week05d04;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate date;
    private int year;
    private int month;
    private int day;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        date = LocalDate.of(year, month, day);
    }
}
