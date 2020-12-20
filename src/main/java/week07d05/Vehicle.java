package week07d05;

public class Vehicle {

    private int numberOfGears = 5;
    private TransmissionTypes transmissiontype = TransmissionTypes.MANUAL;

    public Vehicle(int numberOfGears, TransmissionTypes transmissiontype) {
        this.numberOfGears = numberOfGears;
        this.transmissiontype = transmissiontype;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionTypes getTransmissiontype() {
        return transmissiontype;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setTransmissiontype(TransmissionTypes transmissiontype) {
        this.transmissiontype = transmissiontype;
    }
}
