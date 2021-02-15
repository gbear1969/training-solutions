package exam03;

public enum CruiseClass {
    LUXURY(3.0), FIRST(1.8), SECOND(1);

    private final double priceMod;

    CruiseClass (double priceMod) {
        this.priceMod=priceMod;
    }

    public double getPriceMod() {
        return priceMod;
    }

}
