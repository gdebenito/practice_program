package beverages;

public class HotChocolateWithCream implements Product{
    @Override
    public double price() {
        HotChocolate hotChocolate = new HotChocolate();
        Cream cream = new Cream(); // Some delicious cream

        return hotChocolate.price() + cream.price();

    }
}
