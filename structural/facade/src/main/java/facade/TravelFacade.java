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


  public Collection<FlightHotelPair> getFlightAndHotels(String from, String to) {
    List<FlightHotelPair> listOfFlightsAndHotels = new LinkedList<FlightHotelPair>();
    List<Flight> flights = this.flightBroker.getFlights(from, to);
    List<Hotel> hotels = this.hotelBroker.getHotels(from, to);
    for (Flight flight : flights) {
      for (Hotel hotel : hotels) {
        FlightHotelPair pair = new FlightHotelPair(flight, hotel);
        listOfFlightsAndHotels.add(pair);
      }
    }
    return listOfFlightsAndHotels;
  }

  class FlightHotelPair {
    Hotel hotel;
    Flight flight;

    public FlightHotelPair(Flight flight, Hotel hotel) {
      this.hotel = hotel;
      this.flight = flight;
    }

    @Override
    public String toString() {
      return "{" +
        "" + hotel +
        ", " + flight +
        "}\n";
    }
  }
}
