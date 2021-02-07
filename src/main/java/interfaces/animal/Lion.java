package interfaces.animal;

public class Lion implements Animal {
    private static final int NUMBER_OF_LEGS = 4;
    private String name = "Lion";

    public Lion() {
    }

    public Lion(String name) {
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
