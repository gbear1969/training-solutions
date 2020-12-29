package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {
    private String word;
    private List<String> translations = new ArrayList<>();

    public DictionaryItem(String word, List<String> tL) {
        this.word = word;
        addTranslations(tL);
        // this.translations = translations; hibára fut, mert referenciát adunk értékül, de nem azt fogja módosítani.
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }

    public void addTranslations (List<String> tL) {
        for (String t: tL) {
            if (!translations.contains(t)) {
                translations.add(t);
            }
        }
    }

}
