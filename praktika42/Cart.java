package praktika42;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void clear() {
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }
}

