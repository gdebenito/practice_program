package beverages;

public class CoffeeWithMilk implements Product {

    @Override
    public double price() {
        Coffee coffee = new Coffee();
        Milk milk = new Milk();
        // remember to heat the milk before pouring into the coffe
        milk.heat();

        return coffee.price() + milk.price();
    }
}
