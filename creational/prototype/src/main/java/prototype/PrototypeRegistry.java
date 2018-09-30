package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Prototype> prototypeRegistry;

    public PrototypeRegistry() {
        this.prototypeRegistry = new HashMap<String, Prototype>();
    }

    public void addPrototypeToRegistry(String name, Prototype prototype) {
            this.prototypeRegistry.put(name, prototype);
    }

    public Prototype getPrototypeCloneFromRegistry(String name) {
        return this.prototypeRegistry.get(name).clone();
    }
}
