package aaagyakorlas.kenukolcsonzo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {
/*    private List<CanoeRental> rents = new ArrayList<>();

    public void createRental(CanoeRental canoeRental) {
        rents.add(canoeRental);
    }

    public CanoeRental findRentalByName(String name) {
        for (CanoeRental rent: rents) {
            if (rent.getName().equals(name) && rent.getEndTime() == null) {
                return rent;
            }
        }
        throw new IllegalArgumentException("Not found");
    }

    public void closeRentalByName(String name, LocalDateTime endTime) {
        findRentalByName(name).setEndTime(endTime);
    }

    double getRentalPriceByName(String name, LocalDateTime endTime) {
        CanoeRental calcPrice = findRentalByName(name);
        int hours = (int) Duration.between(calcPrice.getStartTime(), endTime).toHours();
        if (hours < Duration.between(calcPrice.getStartTime(), endTime).toHours()) hours++;
        double mod = 1;
        return hours * 5000 * mod;
    }

    public List<CanoeRental> listClosedRentals() {
        List<CanoeRental> closedRentals = new ArrayList<>();
        for (CanoeRental rent: rents) {
            if (rent.getEndTime() != null) {
                closedRentals.add(rent);
            }
        }

        Collections.sort(closedRentals, new Comparator<CanoeRental>() {
            @Override
            public int compare(CanoeRental o1, CanoeRental o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        });

        return closedRentals;
    }

    public Map<CanoeType, Integer> countRentals() {
        Map<CanoeType, Integer> countOfTypes = new HashMap<>();
        for (CanoeRental rent: rents) {
            if (countOfTypes.containsKey(rent.getCanoeType())) {
                countOfTypes.put(rent.getCanoeType(), countOfTypes.get(rent.getCanoeType()) + 1);
            }
            else {
                countOfTypes.put(rent.getCanoeType(), 1);
            }
        }
        return countOfTypes;
    }
*/
}
