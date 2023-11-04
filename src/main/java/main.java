import Domain.Book;
import Domain.Buyer;

public class main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("Matt", "wright", "" , "");

        buyer.addToCart(new Book("", "", 15.00, false, "","", "",1, Book.Genre.FICTION));
        buyer.addToCart(new Book("", "", 17.00, false, "","", "",1, Book.Genre.FICTION));
        buyer.addToCart(new Book("", "", 19.00, false, "","", "",1, Book.Genre.FICTION));
        buyer.addToCart(new Book("", "", 12.00, false, "","", "",1, Book.Genre.FICTION));

        buyer.logTotal();
    }
}
