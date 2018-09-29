package decorator.example2;

public class FileReader implements Reader {
  private String filePath;

  public FileReader(String filePath) {
    this.filePath = filePath;
  }

  public void read() {
    System.err.println("Reading file from " + this.filePath);
  }
}
