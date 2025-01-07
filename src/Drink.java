public class Drink extends Product {
    private double liters;

    public Drink(String name, double price, double liters) {
        super(name, price);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() +
                " /// Litros: " + liters +
                " /// Precio: $" + getPrice();
    }
}
