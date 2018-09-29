package facade;

public class Hotel {
  String name;
  String from;
  String to;

  public Hotel(String name, String from, String to) {
    this.name = name;
    this.from = from;
    this.to = to;
  }

  @Override
  public String toString() {
    return "Hotel{" +
      "name='" + name + '\'' +
      ", from='" + from + '\'' +
      ", to='" + to + '\'' +
      '}';
  }
}
