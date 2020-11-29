package week05d02;

public class ChangeLetter {
    public String changeVowels (String eredeti) {
        eredeti = eredeti.toLowerCase();
        StringBuilder uj = new StringBuilder();
        for (int i = 0; i < eredeti.length(); i++) {
            String k = eredeti.substring(i, i + 1);
            if ("aeiou".contains(k)) {
                uj.append("*");
            } else {
                uj.append(k);
            }
        }
        return uj.toString();
    }
}
