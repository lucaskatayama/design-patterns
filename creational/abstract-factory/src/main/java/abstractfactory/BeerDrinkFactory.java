package abstractfactory;

public class BeerDrinkFactory implements DrinkFactory {
    @Override
    public Drink createDrink(String type) {
        return new BeerDrink();
    }
}
