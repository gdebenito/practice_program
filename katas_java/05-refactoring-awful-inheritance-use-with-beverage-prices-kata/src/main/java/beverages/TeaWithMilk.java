package beverages;

public class TeaWithMilk implements Product {
    @Override
    public double price() {
        return new Tea().price() + new Milk().price();
    }
}
