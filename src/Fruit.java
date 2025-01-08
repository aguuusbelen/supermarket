public class Fruit extends Product {
    private String unitOfSale;

    public Fruit(String name, double price, String unitOfSale) {
        super(name, price);
        this.unitOfSale = unitOfSale;
    }

    @Override
    public String toString() {
        return super.toString() +
                " /// Unidad de venta: " + unitOfSale;
    }
}
