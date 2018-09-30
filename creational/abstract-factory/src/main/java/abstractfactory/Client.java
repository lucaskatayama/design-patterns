package abstractfactory;

public class Client {
    public static void main(String[] args) {
        PizzaFactory defaultPizzaFactory = new DefaultPizzaFactory();
        DrinkFactory defaultDrinkFactory = new DefaultDrinkFactory();


        PizzaStoreFactory pizzaStoreFactory = new SaoPauloPizzaStoreFactory(
                defaultDrinkFactory,
                defaultPizzaFactory
        );
        Order order = pizzaStoreFactory.createOrder(1);
        order.eat();




        DrinkFactory beerDrinkFactory = new BeerDrinkFactory();
        pizzaStoreFactory = new BerlinPizzaStoreFactory(
                beerDrinkFactory,
                defaultPizzaFactory
        );
        order = pizzaStoreFactory.createOrder(1);
        order.eat();

    }
}
