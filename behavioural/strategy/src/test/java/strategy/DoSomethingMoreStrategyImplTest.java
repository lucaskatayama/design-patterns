package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoSomethingMoreStrategyImplTest {

    @Test
    void doSomething() {
        Strategy strategy = new DoSomethingMoreStrategyImpl();
        strategy.doSomething();
    }
}