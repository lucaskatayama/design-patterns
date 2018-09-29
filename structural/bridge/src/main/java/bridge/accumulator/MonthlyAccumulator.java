package bridge.accumulator;

import bridge.Event;

import java.util.*;

public class MonthlyAccumulator implements Accumulator {
  public Map<String, Collection<Event>> accumulate(Collection<Event> events) {
    Map<String, Collection<Event>> monthlyAccumulation = new HashMap<String, Collection<Event>>();
    for (Event event : events) {
      Collection<Event> monthlyList;
      if (!monthlyAccumulation.containsKey(String.valueOf(event.month))) {
        monthlyList = new LinkedList<Event>();
        monthlyAccumulation.put(String.valueOf(event.month), monthlyList);
      }

      monthlyList = monthlyAccumulation.get(String.valueOf(event.month));
      monthlyList.add(event);


    }

    return monthlyAccumulation;
  }
}
