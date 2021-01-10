package methodstructure.pendrives;

public class Pendrive {
    private String name;
    protected int capacity;
    protected int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        price = (int) (price * (100 + percent) / 100 + 0.5);
    }

    public int comparePricePerCapacity(Pendrive p) {
        return (int) Math.signum(price * 1e8 / capacity - p.getPrice() * 1e8 / p.getCapacity()); //Ezt miért kell kényszeríteni???
    }

    boolean cheaperThan(Pendrive p) {
        return price <  p.getPrice();
    }
}
