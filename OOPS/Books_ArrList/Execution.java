package OOPS.Books_ArrList;

public class Execution {
    public static void main(String[] args) {
        FictionBooks fictionBooks = new FictionBooks();
        Book book1 = new Book("It Ends with Us", "Colleen Hoover", "New York Times", "222-333-333");
        fictionBooks.AddBook(book1);

        BookRepository bookRepository = new BookRepository();
        System.out.println("output is"+bookRepository.getBooks());
    }
}