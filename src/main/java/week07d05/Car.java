package week07d05;

public class Car extends Vehicle {

    private int carNumberOfGears;
    private TransmissionTypes carTransmissionTypes = TransmissionTypes.AUTOMATIC;

    public Car(int numberOfGears, TransmissionTypes transmissiontype, int carNumberOfGears, TransmissionTypes carTransmissionTypes) {
        super(numberOfGears, transmissiontype);
        this.carNumberOfGears = carNumberOfGears;
        this.carTransmissionTypes = carTransmissionTypes;
    }
}
