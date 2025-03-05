package task1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products = new ArrayList<>();

    public double calculateTotal() {
        double total = 0;

        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
