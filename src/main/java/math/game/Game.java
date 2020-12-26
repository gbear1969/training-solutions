package math.game;

public class Game {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("Joachim", new Point(11, -9));
        Warrior w2 = new Warrior("Kahles", new Point(21, 10));

        System.out.println("Kezdődik a játék:");
        System.out.println(w1.toString());
        System.out.println(w2.toString());

        int round = 1;
        while (w1.isAlive() && w2.isAlive()){
            if (w1.distance(w2) != 0) {
                w1.move(w2);
                w2.move(w1);
            } else {
                w1.attack(w2);
                if (w2.isAlive()) {
                    w2.attack(w1);
                }
            }

            System.out.println(round + " kör után:");
            System.out.println(w1.toString());
            System.out.println(w2.toString());

            round++;
        }
        System.out.println("Győzött: " + (w1.isAlive() ? w1.toString() : w2.toString()));
    }
}
