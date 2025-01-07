public abstract class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Nombre: " + name +
                "/// Precio: $" + price;
    }

    @Override
    public int compareTo(Product p) {
        if (price < p.price) {
            return -1;
        }
        else if (price == p.price) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
