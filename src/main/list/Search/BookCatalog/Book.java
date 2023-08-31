package main.list.Search.BookCatalog;

public class Book {
    private String tittle;
    private String author;
    private int publicationyear;

    public Book(String tittle, String author, int publicationyear) {
        this.tittle = tittle;
        this.author = author;
        this.publicationyear = publicationyear;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", publicationyear=" + publicationyear +
                '}';
    }
}
