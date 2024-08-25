package Map.HashMap_LinkedHashMap_TreeHashmap_Implementation;

import java.util.Comparator;

public class Book {

    private int price;
    private String author;
    private String publisher;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(int price, String author, String publisher) {
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }
}
