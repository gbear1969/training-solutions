package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position = new Position(0,0);

    public Trooper(String name) {
        isEmpty(name);
        this.name = name;
    }

    private void isEmpty(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException();
        }
        position = target;
    }

    public double distanceFrom(Position target) {
        if (target == null) {
            throw new IllegalArgumentException();
        }
        return position.distanceFrom(target);
    }


}
