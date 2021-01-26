package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;
    Random random = new Random();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
        do {
            present = Present.values()[random.nextInt(Present.values().length)];
        }
        while (age > 14 && present == Present.TOY);
    }

}
