package methodstructure.bmi;

public class BodyMass {
    private double weightInKg;
    private double heightInM;

    public BodyMass(double weightInKg, double heightInM) {
        this.weightInKg = weightInKg;
        this.heightInM = heightInM;
    }

    public double getWeight() {
        return weightInKg;
    }

    public double getHeight() {
        return heightInM;
    }

    double bodyMassIndex() {
        return  weightInKg / Math.pow(heightInM, 2);
    }

    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else {
            if (bodyMassIndex() > 25) {
                return BmiCategory.OVERWEIGHT;
            } else {
                return BmiCategory.NORMAL;
            }
        }
    }

    public boolean isThinnerThan(BodyMass bodyMass) {
        return bodyMassIndex() < bodyMass.bodyMassIndex();
    }
}
