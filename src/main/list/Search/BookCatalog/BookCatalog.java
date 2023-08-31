package main.list.Search.BookCatalog;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String tittle, String author, Integer publicationyear){
        bookList.add(new Book(tittle, author, publicationyear));

    }
    public List<Book> searchByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if(!bookList.isEmpty()){
            for(Book bookAuthor : bookList){
                if(bookAuthor.getAuthor().equalsIgnoreCase(author)){
                    booksByAuthor.add(bookAuthor);
                }
            }
        }
        return  booksByAuthor;
    }

    public List<Book> searchByYearRange(int initialYear, int finalYear) {
        List<Book> booksByYearRange = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for(Book booksYear : bookList){
                if(booksYear.getPublicationyear() >= initialYear && booksYear.getPublicationyear() <= finalYear){
                    booksByYearRange.add(booksYear);
                }
            }
        }
        return booksByYearRange;
    }


    public Book searchByTittle(String tittle){
        Book bookByTittle = null;
        if(!bookList.isEmpty()){
            for(Book bookTittle : bookList){
                if(bookTittle.getTittle().equalsIgnoreCase(tittle)){
                    bookByTittle = bookTittle;
                    break;
                }
            }
        }
        return bookByTittle;

    }


    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("book 1", "author 1", 2020);
        bookCatalog.addBook("book 1", "author 2", 2021);
        bookCatalog.addBook("book 2", "author 2", 3030);

        System.out.println(bookCatalog.searchByAuthor("author 2"));
        System.out.println(bookCatalog.searchByYearRange(2020, 3030));
        System.out.println(bookCatalog.searchByTittle("book 1"));
    }
}
