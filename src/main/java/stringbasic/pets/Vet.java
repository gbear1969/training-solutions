package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void add(Pet pet) {
        if (!areEquals(pet.getRegNumber())) {
            pets.add(pet);
        }

    }

    private boolean areEquals(String rn) {
        for (Pet pet: pets) {
            if (rn.equals(pet.getRegNumber())) {
                return true;
            }
        }
        return false;
    }
}
