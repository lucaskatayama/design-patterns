package strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new DoSomethingStrategyImpl();
        strategy.doSomething();

        strategy = new DoSomethingMoreStrategyImpl();
        strategy.doSomething();
    }
}
