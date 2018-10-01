package solution;

public abstract class AbstractHandler implements Handler {

    protected Handler nextHandler;

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }
}
