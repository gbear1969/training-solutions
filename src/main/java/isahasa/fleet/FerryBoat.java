package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {
    private final CanCarryGoods cCG;
    private final CanCarryPassengers cCP;

    public FerryBoat(int maxCargoWeight, int maxPassengers) {
        cCG = new CanCarryGoodsBehaviour(maxCargoWeight);
        cCP = new CanCarryPassengersBehaviour(maxPassengers);
    }

    public int loadCargo(int cargoWeight) {
        return cCG.loadCargo(cargoWeight);
    }

    public int getCargoWeight() {
        return cCG.getCargoWeight();
    }

    public int loadPassenger(int passengers) {
        return cCP.loadPassenger(passengers);
    }

    public int getPassengers() {
        return cCP.getPassengers();
    }
}
