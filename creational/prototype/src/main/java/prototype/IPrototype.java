package prototype;

public class IPrototype implements Prototype {

    private String name;

    public IPrototype(String name) {
        this.name = name;
    }

    public IPrototype(IPrototype prototype) {
        this.name = prototype.name;
    }

    public String getName() {
        return name;
    }

    public Prototype clone() {
        return new IPrototype(this.name);
    }
}
