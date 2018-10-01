package solution;

public class ExceptionHandler extends AbstractHandler {
    public void handle(String request) {
        System.err.println("Something else");
    }
}
