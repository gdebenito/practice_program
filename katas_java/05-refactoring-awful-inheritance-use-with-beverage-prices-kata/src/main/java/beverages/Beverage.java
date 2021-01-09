package beverages;

import java.util.ArrayList;
import java.util.List;

public class Beverage implements Product {

    List<Product> productList;

    public Beverage() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    @Override
    public double price() {
        return this.productList.stream().mapToDouble(Product::price).sum();
    }
}

