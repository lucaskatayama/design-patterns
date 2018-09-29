package facade;

import java.util.Arrays;
import java.util.List;

public class HotelBroker {
  public List<Hotel> getHotels(String from, String to) {
    return Arrays.asList(
      new Hotel("H1", "A", "B"),
      new Hotel("H2", "A", "C")
    );
  }
}
