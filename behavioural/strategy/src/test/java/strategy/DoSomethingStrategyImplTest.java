package strategy;

import org.junit.Test;

public class DoSomethingStrategyImplTest {

    @Test
    public void doSomething() {
        Strategy strategy = new DoSomethingMoreStrategyImpl();
        strategy.doSomething();
    }
}