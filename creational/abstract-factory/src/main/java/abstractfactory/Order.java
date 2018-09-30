package abstractfactory;

public class Order {
    Pizza pizza;
    Drink drink;

    public Order(Pizza pizza, Drink drink) {
        this.pizza = pizza;
        this.drink = drink;
    }

    void eat() {
        this.pizza.eat();
        this.drink.drink();
    }
}
