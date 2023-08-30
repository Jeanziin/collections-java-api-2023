package main.list.BasicOperations.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, Double price, Integer quantity) {
        this.items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        if (!items.isEmpty()) {
            for (Item item : items) {
                if (item.getName().equalsIgnoreCase(name)) {
                    itemsToRemove.add(item);
                }
            }
            items.removeAll(itemsToRemove);
        } else {
            System.out.println("List is empty!");
        }
    }

    public Double calculateTotalValue() {
        Double total = 0.0;
        if (!items.isEmpty()) {
            for (Item item : items) {
                Double priceForItem = item.getPrice() * item.getQuantity();
                total += priceForItem;
            }
            return total;
        } else {
            throw new RuntimeException("List is empty!");
        }
    }

    public void displayItems() {
        if (!items.isEmpty()) {
            System.out.println(this.items);
        } else {
            System.out.println("The list is empty!");
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }

}
