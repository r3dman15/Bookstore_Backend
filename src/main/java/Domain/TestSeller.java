package Domain;

public class TestSeller {
    public static void main(String[] args) {
        Seller seller1 = new Seller("John", "Doe", "123456", "john@example.com", "Amazon", "New York");

        // Use the constructor to set the seller's information.

        // Get the shop name using a getter method.
        String shopName = seller1.getShopName();

        System.out.println("Seller Shop Name: " + shopName );
    }
}

