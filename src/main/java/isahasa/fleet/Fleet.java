package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int  waitingPersons;
    private int waitingCargo;

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void loadShip(int passengers, int cargoWeight) {
        waitingPersons = passengers;
        waitingCargo = cargoWeight;

        for (Ship s: ships) {
            if (s instanceof CanCarryPassengers && waitingPersons > 0) {
                waitingPersons = ((CanCarryPassengers) s).loadPassenger(waitingPersons);
            }

            if (s instanceof CanCarryGoods && waitingCargo > 0) {
                waitingCargo = ((CanCarryGoods) s).loadCargo(waitingCargo);
            }
        }
    }
}
