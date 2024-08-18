package OOPS.Books_ArrList;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void removeBook(Book book) {
        books.remove(book);
    }
}
