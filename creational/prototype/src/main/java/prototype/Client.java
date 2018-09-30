package prototype;

public class Client {
    public static void main(String[] args) {
        IPrototype prototype = new IPrototype("Some text");

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototypeToRegistry("orig", prototype);


        IPrototype clonedPrototype = (IPrototype) registry.getPrototypeCloneFromRegistry("orig");

        System.err.println(prototype);
        System.err.println(clonedPrototype);

        System.err.println(prototype.getName());
        System.err.println(clonedPrototype.getName());
    }
}
