package classstructureconstructors;

public class BookMain {
   public static void main(String[] args) {
        Book book = new Book("Jókai", "A kőszívű ember fiai");
        book.register("1/2020");
        System.out.println(book.getAuthor() + ": " + book.getTitle() + " (" + book.getRegNumber() + ")");
    }
}
