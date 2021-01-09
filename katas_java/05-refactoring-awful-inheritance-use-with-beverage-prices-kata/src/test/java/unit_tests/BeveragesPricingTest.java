package unit_tests;

import beverages.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Beverage();
        coffee.addProduct(new Coffee());
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Beverage();
        tea.addProduct(new Tea());
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new Beverage();
        hotChocolate.addProduct(new HotChocolate());
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = new Beverage();
        teaWithMilk.addProduct(new Tea());
        teaWithMilk.addProduct(new Milk());
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = new Beverage();
        coffeeWithMilk.addProduct(new Coffee());
        coffeeWithMilk.addProduct(new Milk());
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {

        Beverage coffeeWithMilkAndCream = new Beverage();
        coffeeWithMilkAndCream.addProduct(new Coffee());
        coffeeWithMilkAndCream.addProduct(new Milk());
        coffeeWithMilkAndCream.addProduct(new Cream());
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = new Beverage();
        hotChocolateWithCream.addProduct(new HotChocolate());
        hotChocolateWithCream.addProduct(new Cream());
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_and_cinnamon_price() {
        Beverage hotChocolateWithCreamAndCinnamon = new Beverage();
        hotChocolateWithCreamAndCinnamon.addProduct(new HotChocolate());
        hotChocolateWithCreamAndCinnamon.addProduct(new Cream());
        hotChocolateWithCreamAndCinnamon.addProduct(new Cinnamon());
        assertThat(hotChocolateWithCreamAndCinnamon.price(),  is(closeTo(1.65, 0.001)));
    }
}
