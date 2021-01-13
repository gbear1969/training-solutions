package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        if (words == null || String.valueOf(c).isEmpty() || String.valueOf(c).isBlank()) {
            throw new IllegalArgumentException("Nem megfelelő tömb vagy karakter!");
        }
        List<String> list = new ArrayList<>();
        for (String w: words) {
            if (w.toLowerCase().contains(String.valueOf(c).toLowerCase())) {
                list.add(w);
            }
        }
        return list;
    }
}
