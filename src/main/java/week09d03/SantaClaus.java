package week09d03;

import java.util.List;

public class SantaClaus {
    private List<Person> persons;

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public void getTroughChimneys() {
        for (Person p: persons) {
            p.setPresent();
        }
    }
}
