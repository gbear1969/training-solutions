package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Csi");
        System.out.println(book);
        System.out.println(book.getTitle());
        book.setTitle("Vuk");
        System.out.println(book.getTitle());
    }
}
