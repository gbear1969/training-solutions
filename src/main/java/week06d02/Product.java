package week06d02;

public class Product {

    private String neve;
    private Category kategoria;
    private int ar;

    public Product(String neve, Category kategoria, int ar) {
        this.neve = neve;
        this.kategoria = kategoria;
        this.ar = ar;
    }

    public String getNeve() {
        return neve;
    }

    public Category getKategoria() {
        return kategoria;
    }

    public int getAr() {
        return ar;
    }
}
