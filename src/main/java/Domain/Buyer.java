package Domain;

public class Buyer extends User {
    private String email;
    private boolean membership;
    private int wallet;
    private Cart cart;



    public Buyer(String firstName, String lastName, String id, String email) {
        super(firstName, lastName, id);
        this.email = email;
        this.membership = false;
        this.wallet = 0;
        this.cart = new Cart();
    }
    public String getEmail() {
         return email;
    }

    public Boolean getMembership() {
        return membership;
    }
    public int getWallet() {
        return wallet;
    }

    public Cart getCart(){
        return cart;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
