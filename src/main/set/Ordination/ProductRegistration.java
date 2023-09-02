package main.set.Ordination;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {

    private Set<Product> setProduct;

    public ProductRegistration() {
        this.setProduct = new HashSet<>();
    }

    public void addProduct(long cod, String name, Integer quantity, Double price){
        this.setProduct.add(new Product(cod, name, quantity, price));

    }

    public Set<Product> displayProductsByName(){
        Set<Product> productsByName = new TreeSet<>(setProduct);
        return productsByName;
    }

    public Set<Product> displayProductsByPirce(){
        Set<Product> productsByPrice = new TreeSet<>(setProduct);
        setProduct.addAll(setProduct);
        return productsByPrice;
    }
}
