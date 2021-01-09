package beverages;

public class Coffee implements Product {
    private final double coffeePrice = 1.2;
    @Override
    public double price() {
        return this.coffeePrice;
    }
}
