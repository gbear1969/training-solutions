package inheritanceconstructor.cars;

public class Car {
    private  double fuelRate;
    private  double fuel;
    private  double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        if (fuelRate * km / 100 >= fuel) {
            throw new RuntimeException("Not enough fuel available!");
        }
        modifyFuelAmount(fuelRate * km / -100);
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    } //kiszámolja, mennyit lehet tankolni
}
