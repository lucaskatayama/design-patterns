package mediator;

public class ComponentB extends Component {
    public ComponentB(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void send() {
        String message = "Hey whassup";
        System.err.println("B is sending: " + message);
        this.mediator.notify(this, message );
    }

    public void receive(String message) {
        System.err.println("B got message: " + message);
    }
}
