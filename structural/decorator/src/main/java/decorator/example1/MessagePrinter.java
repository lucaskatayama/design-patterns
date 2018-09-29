package decorator.example1;

public abstract class MessagePrinter {

  abstract String getMessage();

  void print() {
    System.err.println(this.getMessage());
  }
}
