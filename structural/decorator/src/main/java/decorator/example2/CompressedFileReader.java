package decorator.example2;

public class CompressedFileReader extends ReaderDecorator {

  public CompressedFileReader(Reader reader) {
    super(reader);
  }

  public void read() {
    System.err.println("Decompressing the file.");
    this.reader.read();
  }
}
