package week07d05;

public class Car extends Vehicle {

    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionTypes getTransmissiontype() {
        return TransmissionTypes.AUTOMATIC;
    }
}