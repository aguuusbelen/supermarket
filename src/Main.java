import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Drink coca_zero = new Drink("Coca-Cola Zero", 20, 1.5);
        Drink coca = new Drink("Coca-Cola", 18, 1.5);
        Shampoo shampoo_sedal = new Shampoo("Shampoo Sedal", 19, 500);
        Fruit strawberry = new Fruit("Frutillas", 64, "kilo");

        market.addProduct(coca_zero);
        market.addProduct(coca);
        market.addProduct(shampoo_sedal);
        market.addProduct(strawberry);

        market.printProducts();

        market.sortProducts();
        List<Product> sortedProducts = market.getProducts();

        Product mostExpensive = sortedProducts.get(sortedProducts.size() - 1);
        Product cheapest = sortedProducts.get(0);

        System.out.println("=============================\n"
                + "Producto más caro: " + mostExpensive.getName()
                + "\nProducto más barato: " + cheapest.getName()
        );
    }
}