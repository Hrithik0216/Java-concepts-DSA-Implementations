package Map.HashMap_LinkedHashMap_TreeHashmap_Implementation;

import java.util.*;

public class Execution {
    public static void main(String[] args) {
//        Map<Integer, Book> books = new HashMap<Integer, Book>();
        Map<Book, Integer> books = new TreeMap<>(new PublisherComparator());
        Book book1 = new Book(1000, "It ends with us", "Coolen hover");
        Book book2 = new Book(120, "It starts with us", "Coolen hover");
        Book book3 = new Book(330, "The Alchemist", "Paulo Coelho");
        Book book4 = new Book(4303, "To Kill a Mockingbird", "Harper Lee");
        Book book5 = new Book(533, "1984", "George Orwell");
        Book book6 = new Book(60033, "Pride and Prejudice", "Jane Austen");
        Book book7 = new Book(733, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book8 = new Book(80033, "Moby Dick", "Herman Melville");
        Book book9 = new Book(935, "War and Peace", "Leo Tolstoy");
        Book book10 = new Book(1003, "The Catcher in the Rye", "J.D. Salinger");

        books.put(book1, 1);
        books.put(book2, 2);
        books.put(book3, 3);
        books.put(book4, 4);
        books.put(book5, 5);
        books.put(book6, 6);
        books.put(book7, 7);
        books.put(book8, 8);
        books.put(book9, 9);
        books.put(book10, 10);

//        List<Map.Entry<Integer, Book>> booksList = new ArrayList<>(books.entrySet());
        // Displaying the sorted book list
        for (Map.Entry<Book, Integer> bookEntry : books.entrySet()) {
            Book book = bookEntry.getKey();
            System.out.println(book.getPublisher() + ": " + book.getAuthor() + ", " + book.getPrice());
        }

//        The below is not possible
//        List<Map.Entry<Integer, Book>> booksList = new ArrayList<>();
//        booksList.addAll(books);

        System.out.println("booksList is");
        Set<Map.Entry<Book, Integer>> bookSet = books.entrySet();


        Set<Book> bookKey = books.keySet();
        Collection<Integer> bookValues = books.values();
//        System.out.println(bookKey);
//        System.out.println(bookSet);
//        for (Book book : bookValues) {
//            System.out.println(book.getAuthor() + ", " + book.getPublisher() + ", " + book.getPrice());
//        }
    }
}
