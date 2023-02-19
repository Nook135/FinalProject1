package model;

public class Apple extends Food {
    public Apple (int amount, double price, boolean isVegetarian, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = "red";
    }
}
