package week07d05;

public class Motorcycle extends Truck {

    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionTypes getTransmissiontype() {
        return TransmissionTypes.SEQUENTIAL;
    }
}
