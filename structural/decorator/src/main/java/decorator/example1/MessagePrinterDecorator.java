package decorator.example1;

abstract class MessagePrinterDecorator extends MessagePrinter {

  MessagePrinter messagePrinter;

  MessagePrinterDecorator(MessagePrinter messagePrinter) {
    this.messagePrinter = messagePrinter;
  }


}
