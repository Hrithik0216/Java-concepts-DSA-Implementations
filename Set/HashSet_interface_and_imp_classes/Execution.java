package Set.HashSet_interface_and_imp_classes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Execution {
    public static void main(String[] args) {
        Set<GeneralBook> set = new HashSet<>();
        GeneralBook book = new GeneralBook(1,"It ends with us","Coolen hover", "India");
        GeneralBook book1 = new GeneralBook(1,"It starts with us","Coolen hover", "India");
        GeneralBook book3 = new GeneralBook(3, "The Alchemist", "Paulo Coelho", "HarperCollins");
        GeneralBook book4 = new GeneralBook(4, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.");
        GeneralBook book5 = new GeneralBook(5, "1984", "George Orwell", "Secker & Warburg");
        GeneralBook book6 = new GeneralBook(6, "Pride and Prejudice", "Jane Austen", "T. Egerton");
        GeneralBook book7 = new GeneralBook(7, "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons");
        GeneralBook book8 = new GeneralBook(8, "Moby Dick", "Herman Melville", "Harper & Brothers");
        GeneralBook book9 = new GeneralBook(9, "War and Peace", "Leo Tolstoy", "The Russian Messenger");
        GeneralBook book10 = new GeneralBook(10, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company");

        set.add(book);
        set.add(book1);
        set.add(book3);
        set.add(book4);
        set.add(book5);
        set.add(book6);
        set.add(book7);
        set.add(book8);
        set.add(book9);
        set.add(book10);

        Iterator<GeneralBook> iter = set.iterator();
        while(iter.hasNext()){
            //next() throws the next element. we are storing the the next element in that particular type variable
            GeneralBook gb = iter.next();
            System.out.println(gb.getTitle()+", "+ gb.getAuthor()+", "+ gb.getPublisher());
        }

//        for(GeneralBook gb : set){
//            System.out.println(gb.getTitle());
//        }
    }
}

//Key points:
//See the elements are not stored in order
//Time complexity insertion, deletion, remove, get, is O(1)
