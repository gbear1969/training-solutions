package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {
    private final int MAX_CARRY_WEIGHT = 2000;
    private Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return car == null ? super.getGrossLoad() : super.getGrossLoad() + car.getGrossLoad();
    }

    public boolean canCarry(Car car) {
        return car.getGrossLoad() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (car != null && canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car.toString() +
                '}';
    }

}
