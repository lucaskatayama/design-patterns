package bridge.calculator;

import bridge.Event;
import bridge.accumulator.Accumulator;

import java.util.Collection;
import java.util.Map;

public abstract class Calculator {

  Accumulator accumulator;
  public Calculator(Accumulator accumulator){
    this.accumulator = accumulator;
  }

  public abstract Map<String, Double> calculate(Collection<Event> events);
}
