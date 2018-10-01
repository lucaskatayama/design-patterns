package solution;

public class Type2Handler extends AbstractHandler {
    public void handle(String request) {
        if ("Type 2".equals(request)) {
            System.err.println("Do something 2");
        } else {
            this.nextHandler.handle(request);
        }
    }
}
