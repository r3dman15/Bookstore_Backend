package Domain;

import java.util.ArrayList;

public class Seller extends User {
    private String storeName;
    private String location;
    private int promotionCode;
    private double monthlyPayout;
    private ArrayList<Book> inventory;
    public Seller(String firstName, String lastName, String id, String email, String storeName, String location) {
        super(firstName, lastName, id, email);
        this.storeName = storeName;
        this.location = location;
        this.promotionCode = 0;
        this.monthlyPayout = 0;
        this.inventory = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public int getPromotionCode() {
        return promotionCode;
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
