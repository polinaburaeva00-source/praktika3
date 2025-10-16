package praktika42;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Catalog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return name;
    }
}

