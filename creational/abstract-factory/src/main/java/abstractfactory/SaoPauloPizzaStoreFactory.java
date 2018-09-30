package abstractfactory;

public class SaoPauloPizzaStoreFactory implements PizzaStoreFactory {

    private DrinkFactory drinkFactory;
    private PizzaFactory pizzaFactory;

    public SaoPauloPizzaStoreFactory(DrinkFactory drinkFactory, PizzaFactory pizzaFactory) {
        this.drinkFactory = drinkFactory;
        this.pizzaFactory = pizzaFactory;
    }


    @Override
    public Order createOrder(int number) {
        Order order;
        Pizza pizza;
        Drink drink;
        switch (number) {
            case 1:
                drink = this.drinkFactory.createDrink("Beer");
                pizza = this.pizzaFactory.createPizza("Pepperoni");
                order = new Order(pizza, drink);
                break;
            default:
                throw new IllegalArgumentException("Order id not found");

        }
        return order;
    }
}
