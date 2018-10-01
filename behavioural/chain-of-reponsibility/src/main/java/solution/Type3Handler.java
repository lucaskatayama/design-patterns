package solution;

public class Type3Handler extends AbstractHandler {
    public void handle(String request) {
        if ("Type 3".equals(request)) {
            System.err.println("Do something 3");
        } else {
            this.nextHandler.handle(request);
        }
    }
}
