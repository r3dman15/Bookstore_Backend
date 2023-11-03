package Domain;

public class TestSeller {
    public static void main(String[] args) {
        Seller seller1 = new Seller("John", "Doe", "john@example.com", "Amazon", "New York");
        String shopName = seller1.getShopName();
        System.out.println("Seller Shop Name: " + shopName );
    }
}

