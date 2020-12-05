package week06d04;

public class Item {
    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;

        if (price < 1) {
            throw new IllegalArgumentException("Az ár legalább 1,- Ft!");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("A hónap száma 1 és 12 közé kell essen!");
        }

    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
