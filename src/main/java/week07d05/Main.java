package week07d05;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Truck t = new Truck();
        Motorcycle m = new Motorcycle();
        System.out.println(v.getNumberOfGears());
        System.out.println(v.getTransmissiontype());
        System.out.println(c.getNumberOfGears());
        System.out.println(c.getTransmissiontype());
        System.out.println(t.getNumberOfGears());
        System.out.println(t.getTransmissiontype());
        System.out.println(m.getNumberOfGears());
        System.out.println(m.getTransmissiontype());
    }
}
