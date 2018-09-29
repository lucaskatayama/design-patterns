package decorator.example2;

public class Client {
  public static void main(String[] args) {
    Reader reader = new CompressedFileReader(new EncryptedFileReader(new FileReader("/home/read.txt")));

    reader.read();
  }
}
