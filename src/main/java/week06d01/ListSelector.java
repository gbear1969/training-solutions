package week06d01;

import java.util.List;

public class ListSelector {

    public String parosElemek(List<String> szavak) {

        StringBuilder kimenet = new StringBuilder();

        if (szavak==null) {
            throw new IllegalArgumentException("Hiányzó paraméter!");
        }

        if (szavak.size() != 0) {
            kimenet.append("[");
            for (int i = 0; i < szavak.size(); i = i + 2) {
                kimenet.append(szavak.get(i));
                if (i + 1 < szavak.size()) {
                    kimenet.append(", ");
                }
            }

            kimenet.append("]");
        }

            return kimenet.toString();
    }

}
