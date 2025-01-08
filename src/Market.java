import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Market {
    private List<Product> products;

    public Market() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void sortProducts() {
        Collections.sort(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return products + "\n";

    }
}
