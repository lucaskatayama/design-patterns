package bridge;

public class Event {

  public Integer year;
  public Integer month;
  public Integer day;
  public Double value;

  public Event(Integer year, Integer month, Integer day, Double value) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.value = value;
  }
}
