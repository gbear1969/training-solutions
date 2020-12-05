package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {

        StringBuilder ki = new StringBuilder();
        String[] arrayWords = words.split(" ");
        for (String w: arrayWords) {
            if (!w.equalsIgnoreCase(word)) {
                ki.append(w + " ");
            }
        }
        return ki.toString().trim();
    }

}
