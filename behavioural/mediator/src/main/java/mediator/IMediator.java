package mediator;

import java.util.HashMap;
import java.util.Map;

public class IMediator implements Mediator {
    private final String COMPONENT_A = "componentA";
    private final String COMPONENT_B = "componentB";

    private Map<String, Component> registry = new HashMap<>();


    public void notify(Component sender, String message) {
        String senderName = sender.getName();
        if (COMPONENT_A.equals(senderName)) {
            reactOnB(message);
        } else if (COMPONENT_B.equals(senderName)) {
            reactOnA(message);
        }
    }

    public void register(Component component) {
        this.registry.put(component.getName(), component);
    }

    private void reactOnA(String message) {
        System.err.println("Mediator in action: ");
        this.registry.get(COMPONENT_B).receive(message);
    }

    private void reactOnB(String message) {
        System.err.println("Mediator in action: ");
        this.registry.get(COMPONENT_A).receive(message);
    }
}
