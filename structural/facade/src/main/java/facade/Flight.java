package facade;

public class Flight {
  String name;
  String from;
  String to;

  public Flight(String name, String from, String to) {
    this.name = name;
    this.from = from;
    this.to = to;
  }

  @Override
  public String toString() {
    return "Flight{" +
      "name='" + name + '\'' +
      ", from='" + from + '\'' +
      ", to='" + to + '\'' +
      '}';
  }
}
