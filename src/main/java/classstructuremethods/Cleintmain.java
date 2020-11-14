package classstructuremethods;

public class Cleintmain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Nagy Béla");
        client.setYear(1999);
        client.setAdress("1141 Bp, Pered utca 21.");

        System.out.println("Ügyfél neve: " + client.getName());
        System.out.println("született: " + client.getYear());
        System.out.println("címe: " + client.getAdress());
        client.migrate("1001 Bp, Ó utca 2.");
        System.out.println("Új cím: "+ client.getAdress());
    }
}
