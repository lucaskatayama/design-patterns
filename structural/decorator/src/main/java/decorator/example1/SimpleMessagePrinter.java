package decorator.example1;

public class SimpleMessagePrinter extends MessagePrinter {
  private String message;

  public SimpleMessagePrinter(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

}
