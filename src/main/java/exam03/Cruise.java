package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() == boat.getMaxPassengers()) {
            throw new IllegalArgumentException();
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getPriceMod() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passanger : passengers) {
            if (passanger.getName().equals(name)) {
                return passanger;
            }
        }
        throw new IllegalArgumentException("Passanger not found!");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> passangernamesOrdered = new ArrayList<>();
        for (Passenger passanger : passengers) {
            passangernamesOrdered.add(passanger.getName());
        }
        Collections.sort(passangernamesOrdered);
        return passangernamesOrdered;
    }

    public double sumAllBookingsCharged() {
        double sumPrice = 0;
        for (Passenger passanger : passengers) {
            sumPrice += getPriceForPassenger(passanger);
        }
        return sumPrice;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> countOfTypes = new HashMap<>();
        for (Passenger passanger : passengers) {
            if (countOfTypes.containsKey(passanger.getCruiseClass())) {
                countOfTypes.put(passanger.getCruiseClass(), countOfTypes.get(passanger.getCruiseClass()) + 1);
            }
            else {
                countOfTypes.put(passanger.getCruiseClass(), 1);
            }
        }
        return countOfTypes;
    }

}
