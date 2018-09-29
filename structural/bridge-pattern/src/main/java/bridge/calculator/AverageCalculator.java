package bridge.calculator;

import bridge.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AverageCalculator implements Calculator {
  public Map<String, Double> calculate(Map<String, Collection<Event>> accumulatedEvents) {
    Map<String, Double> result = new HashMap<String, Double>();
    Integer count;
    Double sum;
    for (String key : accumulatedEvents.keySet()) {
      Collection<Event> events = accumulatedEvents.get(key);
      count = events.size();
      sum = 0D;
      for (Event event : events) {
        sum += event.value;
      }
      result.put(key, sum / count);
    }
    return result;
  }
}
