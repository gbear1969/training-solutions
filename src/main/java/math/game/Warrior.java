package math.game;

import java.util.Random;

import static java.lang.Math.signum;

public class Warrior {
    private String name;
    private Point position;
    private int stamina;
    private double skill;

    public Random rand = new Random();

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = rand.nextInt(81) + 20;
        skill = rand.nextDouble();
    }

    public Point getPosition() {
        return position;
    }

    public double distance(Warrior other) {
        return position.distance(other.getPosition());
    }

    public boolean isAlive() {
        if (stamina > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return name + ": (" + position.getX() + ", "+ position.getY() + ") " + stamina;
    }

    public void move(Warrior target) {
        int newX = position.getX() + (int) (signum(target.getPosition().getX() - position.getX()));
        int newY = position.getY() + (int) (signum(target.getPosition().getY() - position.getY()));
        position = new Point(newX, newY);
    }

    public void attack(Warrior target) {
        if (rand.nextDouble() < skill) {
            target.stamina -= rand.nextInt(3) + 1;
        }
    }
}
