package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> books = new ArrayList<>();

    public void add(String book) {
        books.add(book);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> bBF = new ArrayList<>();
        for (String book: books) {
            if (book.startsWith(prefix)) {
                bBF.add(book);
            }
        }
        return bBF;
    }

    public List<String> getTitles() {
        return books;
    }

    public void removeByPrefixWithFor(String prefix) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).startsWith(prefix)) {
                books.remove(i);
            }
        }
    }

    public void removeByPrefix(String prefix) {
        int i = 0;
        while (i < books.size()) {
            if (books.get(i).startsWith(prefix)) {
                books.remove(i);
            } else {
                i++;
            }
        }
    }

    public void removeByPrefixWithForEach(String prefix) {
        List<String> tD = new ArrayList<>();
        for (String book: books) {
            if (book.startsWith(prefix)) {
                tD.add(book);
            }
        }
        books.removeAll(tD);
    }

    public static void main(String[] args) {
        Books b = new Books();
        b.add("Hód és fején kalap");
        b.add("A hódoltság kora");
        b.add("Vuk");
        b.add("Hódításaim története");
        b.add("Vuk legújabb kaladjai");
        b.add("A hóesés anatómiája");
        b.add("Hóember a nagyapám");
        System.out.println("Könyvek: " + b.getTitles());
        System.out.println("'Hód' könyvek: " + b.findAllByPrefix("Hód"));
        b.removeByPrefixWithFor("A hó");
        System.out.println("Bónusz2.1. 'A hó' törölve: " + b.getTitles());
        b.removeByPrefixWithForEach("Hód");
        System.out.println("Bónusz2.2. 'Hód' törölve: " + b.getTitles());
        b.removeByPrefix("Vuk");
        System.out.println("Bónusz2.3. 'Vuk' törölve: " + b.getTitles());
    }

}
