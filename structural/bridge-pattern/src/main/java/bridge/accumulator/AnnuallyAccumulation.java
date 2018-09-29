package bridge.accumulator;

import bridge.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AnnuallyAccumulation implements Accumulator {
  public Map<String, Collection<Event>> accumulate(Collection<Event> events) {
    Map<String, Collection<Event>> annuallyAccumulation = new HashMap<String, Collection<Event>>();
    for (Event event : events) {
      Collection<Event> annuallyList;
      if (!annuallyAccumulation.containsKey(String.valueOf(event.year))) {
        annuallyList = new LinkedList<Event>();
        annuallyAccumulation.put(String.valueOf(event.year), annuallyList);
      }

      annuallyList = annuallyAccumulation.get(String.valueOf(event.year));
      annuallyList.add(event);


    }

    return annuallyAccumulation;
  }
}
