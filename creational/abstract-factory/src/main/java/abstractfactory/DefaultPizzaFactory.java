package abstractfactory;

public class DefaultPizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch(type) {
            case "Pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                throw new IllegalArgumentException("Pizza type not found");

        }
        return pizza;
    }
}
