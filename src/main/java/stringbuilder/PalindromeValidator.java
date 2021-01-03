package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        StringBuilder sB = new StringBuilder(word);
        return  (word.isEmpty() || word.isBlank()) || word.equalsIgnoreCase(sB.reverse().toString());
    }
}
