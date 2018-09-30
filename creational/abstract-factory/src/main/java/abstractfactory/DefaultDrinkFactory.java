package abstractfactory;

public class DefaultDrinkFactory implements DrinkFactory {
    public Drink createDrink(String type) {
        Drink drink;
        switch(type) {
            case "Beer":
                drink = new BeerDrink();
                break;
            default:
                throw new IllegalArgumentException("Drink type not found");

        }
        return drink;
    }
}
