package beverages;

public class HotChocolate implements Product {

    private final double hotChocolatePrice = 1.45;
    @Override
    public double price() {

        return this.hotChocolatePrice;
    }
}
