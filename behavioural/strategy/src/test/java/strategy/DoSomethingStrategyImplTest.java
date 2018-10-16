package strategy;

import static org.junit.jupiter.api.Assertions.*;

class DoSomethingStrategyImplTest {

    @org.junit.jupiter.api.Test
    void doSomething() {
        Strategy strategy = new DoSomethingMoreStrategyImpl();
        strategy.doSomething();
    }
}