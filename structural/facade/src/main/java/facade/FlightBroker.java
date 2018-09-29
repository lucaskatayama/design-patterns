package facade;

import java.util.*;

public class FlightBroker {
  public List<Flight> getFlights(String from, String to) {
    return Arrays.asList(
      new Flight("F1", "A", "B"),
      new Flight("F2", "A", "C")
    );
  }
}
