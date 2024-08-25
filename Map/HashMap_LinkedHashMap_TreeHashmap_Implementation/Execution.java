package Map.HashMap_LinkedHashMap_TreeHashmap_Implementation;

import java.util.*;

public class Execution {
    public static void main(String[] args) {
//        Map<Integer, Book> books = new HashMap<Integer, Book>();
        Map<Integer, Book> books = new TreeMap<>();
        Book book1 = new Book(100, "It ends with us", "Coolen hover");
        Book book2 = new Book(120, "It starts with us", "Coolen hover");
        Book book3 = new Book(330, "The Alchemist", "Paulo Coelho");
        Book book4 = new Book(433, "To Kill a Mockingbird", "Harper Lee");
        Book book5 = new Book(533, "1984", "George Orwell");
        Book book6 = new Book(633, "Pride and Prejudice", "Jane Austen");
        Book book7 = new Book(733, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book8 = new Book(833, "Moby Dick", "Herman Melville");
        Book book9 = new Book(935, "War and Peace", "Leo Tolstoy");
        Book book10 = new Book(103, "The Catcher in the Rye", "J.D. Salinger");

        books.put(1, book1);
        books.put(2, book2);
        books.put(3, book3);
        books.put(4, book4);
        books.put(5, book5);
        books.put(6, book6);
        books.put(7, book7);
        books.put(8, book8);
        books.put(9, book9);
        books.put(10, book10);

        List<Map.Entry<Integer, Book>> booksList = new ArrayList<>(books.entrySet());
        for (Map.Entry<Integer, Book> bookEntry : booksList) {
            System.out.println(bookEntry.getKey() + ", " + bookEntry.getValue().getPrice());
        }

//        The below is not possible
//        List<Map.Entry<Integer, Book>> booksList = new ArrayList<>();
//        booksList.addAll(books);

        System.out.println("booksList is");
        Set<Map.Entry<Integer, Book>> bookSet = books.entrySet();


        Set<Integer> bookKey = books.keySet();
        Collection<Book> bookValues = books.values();
//        System.out.println(bookKey);
//        System.out.println(bookSet);
//        for (Book book : bookValues) {
//            System.out.println(book.getAuthor() + ", " + book.getPublisher() + ", " + book.getPrice());
//        }
    }
}
