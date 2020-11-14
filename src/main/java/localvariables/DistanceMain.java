package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(95.41,false);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());
        int intDistance = (int) distance.getDistanceInKm();
        System.out.println(intDistance);
    }
}
