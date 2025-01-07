public class Shampoo extends Product {
    private Integer content;

    public Shampoo(String name, double price, Integer content) {
        super(name, price);
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() +
                " /// Contenido: " + content +
                "ml /// Precio: $" + getPrice();
    }
}
