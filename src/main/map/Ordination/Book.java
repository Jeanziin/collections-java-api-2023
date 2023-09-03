package main.map.Ordination;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book b) {
        return Double.compare(price, b.getPrice());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

class AuthorComparator implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        return b1.getValue().getAuthor().compareToIgnoreCase(b2.getValue().getAuthor());
    }
}
