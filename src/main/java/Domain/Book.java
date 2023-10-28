package Domain;

public class Book extends Item{
    private String author;
    private String publisher;
    private String illustrator;
    private int pageCount;
    private Genre genre;


    public Book(String name, String description, double price, boolean isDiscount,
                String author, String publisher, String illustrator, int pageCount, Genre genre) {
        super(name, description, Category.BOOK, price, isDiscount);
        this.author = author;
        this.publisher = publisher;
        this.illustrator = illustrator;
        this.pageCount = pageCount;
        this.genre = genre; 
    }

    public enum Genre {
        FICTION,
        NONFICTION
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

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
