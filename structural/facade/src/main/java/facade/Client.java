package facade;

import java.util.Collection;

public class Client {
  public static void main(String[] args) {
    TravelFacade travelFacade = new TravelFacade();
    Collection result = travelFacade.getFlightAndHotels("A", "B");
    System.err.println(result);
  }
}
