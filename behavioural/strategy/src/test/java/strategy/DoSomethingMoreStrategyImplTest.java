package strategy;

import org.junit.Test;

public class DoSomethingMoreStrategyImplTest {

    @Test
    public void doSomething() {
        Strategy strategy = new DoSomethingMoreStrategyImpl();
        strategy.doSomething();
    }
}