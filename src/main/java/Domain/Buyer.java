package Domain;

import java.util.ArrayList;

public class Buyer extends User {

    private class Cart extends ArrayList<Book> {
        public Cart (){}
    }

    private boolean membership;
    private int wallet;
    private Cart cart;



    public Buyer(String firstName, String lastName, String id, String email) {
        super(firstName, lastName, id, email);
        this.membership = false;
        this.wallet = 0;
        this.cart = new Cart();
    }

    public Boolean getMembership() {
        return membership;
    }
    public int getWallet() {
        return wallet;
    }


    public void addToCart(Book book) {
        cart.add(book);
    }

    public void remove(Book book) {
        cart.remove(book);
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

}

