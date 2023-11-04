package Domain;

import java.util.ArrayList;

public class Buyer extends User {

    private class Cart extends ArrayList<Item> {
        private final int MAX = 20;

        private double tax;
        private  int capacity;

        public Cart (double tax){
            this.capacity = MAX;
            this.tax = tax;
        }
        public int getCapacity() {
            return capacity;
        }

        public double getTotalPrice(){
            double total = 0.0;
            for ( int i = 0; i < cart.size(); i++) {
               total += cart.get(i).getPrice();
            }
            return total + (total * tax);
        }

    }

    private boolean membership;
    private int wallet;
    private Cart cart;



    public Buyer(String firstName, String lastName, String id, String email) {
        super(firstName, lastName, id, email);
        this.membership = false;
        this.wallet = 0;
        this.cart = new Cart(.07);
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

    public void logTotal (){
        System.out.println(cart.getTotalPrice());
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

