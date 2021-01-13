package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    private void isEmpty(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findTrooperByName(String name) {
        isEmpty(name);
        for (Trooper t: troopers) {
            if (name.equals(t.getName())) {
                return t;
            }

        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException();
        }
        Trooper c = null;
        for (Trooper t: troopers) {
            if (c== null || t.distanceFrom(target) < c.distanceFrom(target)) {
                c = t;
            }
        }
        return c;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        if (target == null || trooper == null) {
            throw new IllegalArgumentException();
        }        trooper.changePosition(target);
    }

}
