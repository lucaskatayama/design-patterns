package bridge.calculator;

import bridge.Event;

import java.util.Collection;
import java.util.Map;

public interface Calculator {
  Map<String, Double> calculate(Map<String, Collection<Event>> accumulatedEvents);
}
