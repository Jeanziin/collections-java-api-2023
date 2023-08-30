package main.list.BasicOperations.ShoppingCart;

public class Item {
    private String name;
    private Double price;
    private Integer quantity;

    public Item(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + name + '\'' +
                ", preco=" + price +
                ", quantidade=" + quantity +
                '}';
    }
}
