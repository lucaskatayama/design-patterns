package mediator;

public class ComponentA extends Component {
    public ComponentA(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void send() {
        String message = "I'm good";
        System.err.println("A is sending: " + message);
        this.mediator.notify(this, message );
    }

    public void receive(String message) {
        System.err.println("B got message: " + message);
    }
}
