package main.map.Search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<Long, Product> productStockMap;

    public ProductStock() {
        this.productStockMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price) {
        productStockMap.put(code, new Product(name, price, quantity));
    }

    public void displayProducts() {
        System.out.println(productStockMap);
    }

    public double calculateTotalStockValue() {
        double totalStockValue = 0d;
        if (!productStockMap.isEmpty()) {
            for (Product p : productStockMap.values()) {
                totalStockValue += p.getQuantity() * p.getPrice();
            }
        }
        return totalStockValue;
    }

    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;
        for (Product p : productStockMap.values()) {
            if (p.getPrice() > highestPrice) {
                mostExpensiveProduct = p;
                highestPrice = p.getPrice();
            }
        }
        return mostExpensiveProduct;
    }

    public Product getCheapestProduct() {
        Product cheapestProduct = null;
        double lowestPrice = Double.MAX_VALUE;
        for (Product p : productStockMap.values()) {
            if (p.getPrice() < lowestPrice) {
                cheapestProduct = p;
                lowestPrice = p.getPrice();
            }
        }
        return cheapestProduct;
    }

    public Product getProductWithHighestTotalValueInStock() {
        Product productWithHighestTotalValue = null;
        double highestTotalProductValue = 0d;
        if (!productStockMap.isEmpty()) {
            for (Map.Entry<Long, Product> entry : productStockMap.entrySet()) {
                double productValueInStock = entry.getValue().getPrice() * entry.getValue().getQuantity();
                if (productValueInStock > highestTotalProductValue) {
                    highestTotalProductValue = productValueInStock;
                    productWithHighestTotalValue = entry.getValue();
                }
            }
        }
        return productWithHighestTotalValue;
    }

    public static void main(String[] args) {
        ProductStock stock = new ProductStock();

        // Displays the empty stock
        stock.displayProducts();

        // Adds products to stock
        stock.addProduct(1L, "Laptop", 1, 1500.0);
        stock.addProduct(2L, "Mouse", 5, 25.0);
        stock.addProduct(3L, "Monitor", 10, 400.0);
        stock.addProduct(4L, "Keyboard", 2, 40.0);

        // Displays the products in stock
        stock.displayProducts();

        // Calculates and displays the total stock value
        System.out.println("Total stock value: $" + stock.calculateTotalStockValue());

        // Gets and displays the most expensive product
        Product mostExpensiveProduct = stock.getMostExpensiveProduct();
        System.out.println("Most expensive product: " + mostExpensiveProduct);

        // Gets and displays the cheapest product
        Product cheapestProduct = stock.getCheapestProduct();
        System.out.println("Cheapest product: " + cheapestProduct);

        // Gets and displays the product with the highest total value in stock
        Product productWithHighestTotalValue = stock.getProductWithHighestTotalValueInStock();
        System.out.println("Product with highest total value in stock: " + productWithHighestTotalValue);
    }
}
