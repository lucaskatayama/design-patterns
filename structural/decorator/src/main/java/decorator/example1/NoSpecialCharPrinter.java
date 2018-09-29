package decorator.example1;

public class NoSpecialCharPrinter extends MessagePrinterDecorator {
  public NoSpecialCharPrinter(MessagePrinter messagePrinter) {
    super(messagePrinter);
  }

  public String getMessage() {
    return this.messagePrinter.getMessage().replaceAll("!", "");
  }

}
