package beverages;

final class Cream implements Product {

    private final double creamPrice = 0.15;

    @Override
    public double price() {
        return this.creamPrice;
    }
}
