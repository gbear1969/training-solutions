package isahasa.fleet;


public class CargoShip implements Ship, CanCarryGoods {
    private final CanCarryGoods cCG;

    public CargoShip(int maxCargoWeight) {
        cCG = new CanCarryGoodsBehaviour(maxCargoWeight);
    }

    public int loadCargo(int cargoWeight) {
        return cCG.loadCargo(cargoWeight);
    }

    public int getCargoWeight() {
        return cCG.getCargoWeight();
    }
}