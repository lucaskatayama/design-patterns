package bridge.accumulator;

import bridge.Event;

import java.util.Collection;
import java.util.Map;

public interface Accumulator {
  Map<String, Collection<Event>> accumulate(Collection<Event> events);
}
