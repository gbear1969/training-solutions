package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store cipo = new Store("Cipő");
        Store kalap = new Store("Kalap");

        cipo.store(3);
        System.out.println(cipo.getStock() + " " + cipo.getProduct());
        System.out.println(kalap.getStock() + " " + kalap.getProduct());
        System.out.println();

        kalap.dispath(1);
        System.out.println(cipo.getStock() + " " + cipo.getProduct());
        System.out.println(kalap.getStock() + " " + kalap.getProduct());
        System.out.println();

        kalap.store(5);
        System.out.println(cipo.getStock() + " " + cipo.getProduct());
        System.out.println(kalap.getStock() + " " + kalap.getProduct());
        System.out.println();

        cipo.dispath(2);
        System.out.println(cipo.getStock() + " " + cipo.getProduct());
        System.out.println(kalap.getStock() + " " + kalap.getProduct());
        System.out.println();

    }
}
