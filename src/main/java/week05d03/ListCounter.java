package week05d03;

import java.util.List;

public class ListCounter {

    public int listCounter (List<String> lista) {
        int db = 0;
        for (String elem: lista) {
            if ("a".equalsIgnoreCase(elem.substring(0, 1))) {
                db++;
            }
        }
        return db;
    }
}
