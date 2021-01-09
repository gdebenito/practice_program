package beverages;

public class Milk implements Product {

    private final double milkPrice = 0.10;

    @Override
    public double price() {
        return milkPrice;
    }

    public void heat() {
        // This method heats the milk... literally... trust me!
    }
}
