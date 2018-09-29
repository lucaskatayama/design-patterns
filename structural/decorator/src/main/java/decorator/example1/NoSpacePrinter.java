package decorator.example1;

public class NoSpacePrinter extends MessagePrinterDecorator {
  public NoSpacePrinter(MessagePrinter messagePrinter) {
    super(messagePrinter);
  }

  public String getMessage() {
    return this.messagePrinter.getMessage().replaceAll(" ", "");
  }

}
