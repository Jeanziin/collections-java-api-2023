package main.map.Ordination;

import java.util.*;

/**
 * @see "https://www.cblservicos.org.br/isbn/search/"
 */
public class OnlineBookstore {
    private Map<String, Book> books;

    public OnlineBookstore() {
        this.books = new HashMap<>();
    }

    public void addBook(String link, Book book) {
        books.put(link, book);
    }

    public void removeBook(String title) {
        List<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            if (entry.getValue().getTitle().equalsIgnoreCase(title)) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (String key : keysToRemove) {
            books.remove(key);
        }
    }

    public Map<String, Book> displayBooksSortedByPrice() {
        return new TreeMap<>(books);
    }

    public Map<String, Book> searchBooksByAuthor(String author) {
        Map<String, Book> booksByAuthor = new LinkedHashMap<>();
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.getAuthor().equals(author)) {
                booksByAuthor.put(entry.getKey(), book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> getMostExpensiveBook() {
        List<Book> mostExpensiveBooks = new ArrayList<>();
        double highestPrice = Double.MIN_VALUE;

        if (!books.isEmpty()) {
            for (Book book : books.values()) {
                if (book.getPrice() > highestPrice) {
                    highestPrice = book.getPrice();
                }
            }
        } else {
            throw new NoSuchElementException("The bookstore is empty!");
        }

        for (Map.Entry<String, Book> entry: books.entrySet()) {
            if (entry.getValue().getPrice() == highestPrice) {
                Book bookWithHighestPrice = books.get(entry.getKey());
                mostExpensiveBooks.add(bookWithHighestPrice);
            }
        }
        return mostExpensiveBooks;
    }

    public List<Book> getCheapestBook() {
        List<Book> cheapestBooks = new ArrayList<>();
        double lowestPrice = Double.MAX_VALUE;

        if (!books.isEmpty()) {
            for (Book book : books.values()) {
                if (book.getPrice() < lowestPrice) {
                    lowestPrice = book.getPrice();
                }
            }
        } else {
            throw new NoSuchElementException("The bookstore is empty!");
        }

        for (Map.Entry<String, Book> entry: books.entrySet()) {
            if (entry.getValue().getPrice() == lowestPrice) {
                Book bookWithLowestPrice = books.get(entry.getKey());
                cheapestBooks.add(bookWithLowestPrice);
            }
        }
        return cheapestBooks;
    }

    public static void main(String[] args) {
        OnlineBookstore onlineBookstore = new OnlineBookstore();
        // Adds books to the online bookstore
        onlineBookstore.addBook("https://amzn.to/3EclT8Z", new Book("1984", "George Orwell", 50d));
        onlineBookstore.addBook("https://amzn.to/47Umiun", new Book("Animal Farm", "George Orwell", 7.05d));
        onlineBookstore.addBook("https://amzn.to/3L1FFI6", new Book("Bird Box: Don't Open Your Eyes", "Josh Malerman", 19.99d));
        onlineBookstore.addBook("https://amzn.to/3OYb9jk", new Book("Malorie", "Josh Malerman", 5d));
        onlineBookstore.addBook("https://amzn.to/45HQE1L", new Book("And Then There Were None", "Agatha Christie", 50d));
        onlineBookstore.addBook("https://amzn.to/45u86q4", new Book("Murder on the Orient Express", "Agatha Christie", 5d));

        // Displays all books sorted by price
        onlineBookstore.displayBooksSortedByPrice();

        // Searches books by author
        String authorSearch = "Josh Malerman";
        onlineBookstore.searchBooksByAuthor(authorSearch);

        // Gets and displays the most expensive book
        System.out.println("Most expensive book: " + onlineBookstore.getMostExpensiveBook());

        // Gets and displays the cheapest book
        System.out.println("Cheapest book: " + onlineBookstore.getCheapestBook());

        // Removes a book by title
        onlineBookstore.removeBook("1984");
        System.out.println(onlineBookstore.books);
    }
}
