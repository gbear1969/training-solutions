package isahasa.fleet;


public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight){
        int remainder = 0;

        if (cargoWeight <= maxCargoWeight) {
            this.cargoWeight = cargoWeight;
        } else
        {
            remainder = cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
        }

        return remainder;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}

/*
public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int remain = 0;
        if (cargoWeight <= maxCargoWeight) {
            this.cargoWeight = cargoWeight;
        } else {
            remain = cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
        }
        return remain;
    }

    @Override
    public int getCargoWeight() {
        return getCargoWeight();
    }
}*/
