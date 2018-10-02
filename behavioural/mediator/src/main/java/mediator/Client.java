package mediator;

public class Client {

    public static void main(String[] args) {

        Mediator mediator = new IMediator();
        Component compA = new ComponentA("componentA", mediator);
        Component compB = new ComponentB("componentB", mediator);

        mediator.register(compA);
        mediator.register(compB);
        compA.send();
        compB.send();
    }
}
