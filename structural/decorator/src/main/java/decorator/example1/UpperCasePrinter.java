package decorator.example1;

public class UpperCasePrinter extends MessagePrinterDecorator {

  public UpperCasePrinter(MessagePrinter messagePrinter) {
    super(messagePrinter);
  }

  public String getMessage() {
    return this.messagePrinter.getMessage().toUpperCase();
  }

}
