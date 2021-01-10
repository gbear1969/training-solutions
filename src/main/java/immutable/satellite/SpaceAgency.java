package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    private List<Satellite> sats = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        sats.add(satellite);
    }

    public String toString() {
        return sats.toString();
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite s: sats) {
            if (registerIdent.equalsIgnoreCase(s.getRegisterIdent())) {
                return s;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!XXX123");
    }
}
