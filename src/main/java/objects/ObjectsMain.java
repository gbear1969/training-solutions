package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {

        new Book();
        System.out.println(new Book());

        Book emptyBook = new Book();
        System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        System.out.println(anotherBook instanceof Book);

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> list = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> list2 = new ArrayList<>();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);

    }
}
