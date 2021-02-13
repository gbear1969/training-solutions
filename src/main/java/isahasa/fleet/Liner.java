package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {
    private final CanCarryPassengers cCP;

    public Liner(int maxPassengers) {
        cCP = new CanCarryPassengersBehaviour(maxPassengers);
    }

    public int loadPassenger(int passengers) {
        return cCP.loadPassenger(passengers);
    }

    public int getPassengers() {
        return cCP.getPassengers();
    }
}
