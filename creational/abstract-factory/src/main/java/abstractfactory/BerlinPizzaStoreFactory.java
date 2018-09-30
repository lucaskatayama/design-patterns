package abstractfactory;

public class BerlinPizzaStoreFactory implements PizzaStoreFactory {
    DrinkFactory drinkFactory;
    PizzaFactory pizzaFactory;

    public BerlinPizzaStoreFactory(DrinkFactory beerDrinkFactory, PizzaFactory defaultPizzaFactory) {
        this.drinkFactory = beerDrinkFactory;
        this.pizzaFactory = defaultPizzaFactory;
    }

    @Override
    public Order createOrder(int number) {
        return new Order(this.pizzaFactory.createPizza("Pepperoni"), this.drinkFactory.createDrink("Beer"));
    }
}
