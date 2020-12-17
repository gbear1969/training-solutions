package week08d04;

public class Main {
    public static void main(String[] args) {
    Trainer trainer = new Trainer(new GoodMood());
    Trainer trainer2 = new Trainer(new BadMood());
    System.out.println(trainer.giveMark());
    System.out.println(trainer2.giveMark());
    }
}
