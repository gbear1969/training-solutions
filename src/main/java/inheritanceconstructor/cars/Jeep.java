package inheritanceconstructor.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public double getFuel() {
        return super.getFuel() + extraFuel;
    }

    @Override
    public double getTankCapacity() {
        return super.getTankCapacity() + extraCapacity;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        extraFuel += fuel;
        if (extraFuel < 0) {
            super.modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    @Override
    public void drive(int km) {
        if (getFuelRate() * km / 100 >= getFuel()) {
            throw new RuntimeException("Not enough fuel available!");
        }
        modifyFuelAmount(getFuelRate() * km / -100);
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    @Override
    public double calculateRefillAmount() {
        return getTankCapacity() - getFuel();
    } //kiszámolja, mennyit lehet tankolni
}
