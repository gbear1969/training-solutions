package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private double distance = 0;
    private double azimut = 0;
    private List<NavigationPoint> navigationList = new ArrayList<>();


    public double getDistance() {
        return distance;
    }

    public double getAzimut() {
        return azimut;
    }

    public List<NavigationPoint> getNavigationList() {
        return navigationList;
    }

    public Robot go(int meter) {
        distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        navigationList.add(new NavigationPoint(distance, azimut));
        return this;
    }
}
