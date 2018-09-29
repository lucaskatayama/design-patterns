package decorator.example1;

public class Client {
  public static void main(String[] args) {
    String message = "hello world!";
    MessagePrinter printer = new SimpleMessagePrinter(message);
    printer.print();

    printer = new UpperCasePrinter(
      new SimpleMessagePrinter(message)
    );
    printer.print();

    printer = new NoSpacePrinter(
      new SimpleMessagePrinter(message)
    );
    printer.print();


    printer = new UpperCasePrinter(
      new NoSpacePrinter(
        new SimpleMessagePrinter(message)
      )
    );
    printer.print();

    printer = new UpperCasePrinter(
      new NoSpecialCharPrinter(
        new NoSpacePrinter(
          new SimpleMessagePrinter(message)
        )
      )
    );
    printer.print();
  }
}
