package Domain;

import java.util.ArrayList;

public class Seller extends User {
    private String storeName;
    private double monthlyPayout;
    private ArrayList<Book> inventory;
    public Seller(String firstName, String lastName, String id, String email, String storeName) {
        super(firstName, lastName, id, email);
        this.storeName = storeName;
        this.monthlyPayout = 0;
        this.inventory = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }
    public double getMonthlyPayout() {
        return monthlyPayout;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public String getShopName() {
        return storeName;
    }
}
