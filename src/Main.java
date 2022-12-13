class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;


    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("L. Tolstoy");
        Author author2 = new Author("Donato Karizi");

        Book warAndPeace = new Book("War and Peace", author1, 1876);
        Book whisperer = new Book("Whisperer", author2, 2011);

        whisperer.setPublishYear(2012);
    }
}
