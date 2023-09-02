package main.set.Ordination;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
    private long cod;
    private String name;
    private  Integer quantity;
    private Double price;

    public Product(long cod, String name, Integer quantity, Double price) {
        this.cod = cod;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public long getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getCod(), product.getCod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "Product{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return name.compareToIgnoreCase(o.getName());
    }
}
