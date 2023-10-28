package Domain;

public class Item {
    private String name;
    private String description;
    private Category category;
    private double price;
    private boolean isDiscount;

    public Item(String name, String description, Category category, double price, boolean isDiscount){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isDiscount = false;
    }
    public enum Category {
        BOOK,
        CUSTOM
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(boolean Discount) {
        isDiscount = Discount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
