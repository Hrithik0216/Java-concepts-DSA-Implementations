package LinkedList_Methods.Books_ArrList;

public class FictionBooks implements BookCollection{
    @Override
    public void AddBook(Book book){
        BookRepository.addBook(book);
    }

    @Override
    public void RemoveBook(Book book) {
        BookRepository.removeBook(book);
    }

    ;
}
