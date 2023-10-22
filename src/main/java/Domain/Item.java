package Domain;

public class Item {
    private String itemName;
    private String description;
    private String category;
    private double price;
    private int quantity;
    private boolean addToCart;
    private boolean discount;

    public Item(String itemName, String description, String category, double price, int quantity, boolean addToCart, boolean discount){
        this.itemName = itemName;
        this.description = description;
        this.category = "Book";
        this.price = 0;
        this.quantity = 0;
        this. addToCart = false;
        this.discount = false;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAddToCart() {
        return addToCart;
    }

    public void setAddToCart(boolean addToCart) {
        this.addToCart = addToCart;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
