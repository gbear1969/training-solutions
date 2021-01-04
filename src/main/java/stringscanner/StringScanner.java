package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        if (isEmpty(delimiter)) {
            delimiter = " ";
        }
        Scanner sc = new Scanner(intString).useDelimiter(delimiter);
        int sum = 0;
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
            } else {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, "");
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text) || word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        String r = "";
        String l = "";
        try (Scanner sc = new Scanner(text)) {
            while (sc.hasNextLine()) {
                l = sc.nextLine();
                if (l.contains(word)) {
                    r = r.concat(l);
                    r = r.concat("\n");
                }
            }
        }
        return r.trim();
    }

    public boolean isEmpty(String string) {
        return string == null || string.isEmpty() || string.isBlank();
    }
}
