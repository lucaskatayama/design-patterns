package decorator.example2;

public class EncryptedFileReader extends ReaderDecorator {
  public EncryptedFileReader(Reader reader) {
    super(reader);
  }

  public void read() {
    System.err.println("De-crypting file.");
    this.reader.read();
  }
}
