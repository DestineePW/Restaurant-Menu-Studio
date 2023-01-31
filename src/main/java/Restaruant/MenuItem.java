package Restaruant;

import java.util.Date;
public class MenuItem {

    private String name;
    private String description;
    private int price;
    private String category;
    private Date dateAdded;

    public MenuItem(String name, String description, int price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return  name.toUpperCase() + " | " +
                category.toUpperCase() + " $" + price + newText + '\n' +
                description + '\n';
    }

    boolean isNew() {
        return true;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
}