package week05d05;

public class Usermain {

    public static void main(String[] args) {
        User user1 = new User("Géber", "András", "ga@fm.hu");
        User user2 = new User("Géber", "Gabriella", "gg.fm@hu");
        User user3 = new User("Géber", "Gyöngyi", "g@.h");
        User user4 = new User("Géber", "Péter", "gp@fm,hu");
        User user5 = new User("Géber", "Melinda", "gm#fm.hu");

        System.out.println(user1.getFullName());
        System.out.println(user2.getFullName());
        System.out.println(user3.getFullName());
        System.out.println(user4.getFullName());
        System.out.println(user5.getFullName());
    }
}
