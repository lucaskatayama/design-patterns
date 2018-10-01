package solution;

public class Type1Handler extends AbstractHandler {
    public void handle(String request) {
        if ("Type 1".equals(request)) {
            System.err.println("Do something 1");
        } else {
            this.nextHandler.handle(request);
        }
    }
}
