package facade;

import javafx.util.Pair;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TravelFacade {

  FlightBroker flightBroker;
  HotelBroker hotelBroker;

  public TravelFacade() {
    this.flightBroker = new FlightBroker();
    this.hotelBroker = new HotelBroker();
  }


  public Collection<Pair<Flight, Hotel>> getFlightAndHotels(String from, String to) {
    List<Pair<Flight, Hotel>> listOfFlightsAndHotels = new LinkedList<Pair<Flight, Hotel>>();
    List<Flight> flights = this.flightBroker.getFlights(from, to);
    List<Hotel> hotels = this.hotelBroker.getHotels(from, to);
    for (Flight flight : flights) {
      for (Hotel hotel : hotels) {
        Pair<Flight, Hotel> pair = new Pair<Flight, Hotel>(flight, hotel);
        listOfFlightsAndHotels.add(pair);
      }
    }
    return listOfFlightsAndHotels;
  }
}
