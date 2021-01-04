package filescanner.library;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> listOfBooks = new ArrayList<>();

    public void loadFromFile() {
        String regNum = "";
        String author = "";
        String title = "";
        int yearOfPublish = 0;
        try (Scanner sc = new Scanner(Library.class.getResourceAsStream("/books.csv"))) {
            sc.useDelimiter(";|(\r\n)|\n");
            while (sc.hasNextLine()) {
                regNum = sc.next();
                author = sc.next();
                title = sc.next();
                yearOfPublish = sc.nextInt();
                listOfBooks.add(new Book(regNum, author, title, yearOfPublish));
            }
        }
    }

    public List<Book> getBooks() {
        return listOfBooks;
    }

}
