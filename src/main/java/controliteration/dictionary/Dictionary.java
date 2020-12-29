package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String w, List<String> tL) {
        boolean nI = true;
        for (DictionaryItem d: dictionaryItems) {
            if (w.equalsIgnoreCase(d.getWord())) {
                d.addTranslations(tL);
                nI = false;
            }
        }
        if (nI) {
            dictionaryItems.add(new DictionaryItem(w, tL));
        }
    }

    public List<String> findTranslations(String w) {
        List<String> r = new ArrayList<>();
        for (DictionaryItem d: dictionaryItems) {
            if (w.equalsIgnoreCase(d.getWord())) {
                return d.getTranslations();
            }
        }
        return r;
    }
}
