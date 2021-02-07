package interfaces.animal;

public class Worm implements Animal {
    private static final int NUMBER_OF_LEGS = 0;
    private String name = "Worm";

    public Worm() {
    }

    public Worm(String name) {
        this.name = name;
    }

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return name;
    }
}
