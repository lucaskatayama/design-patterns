package observer;

public class Person implements Observer {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(int value) {
        System.err.printf("%s is getting updated: %d%n", this.name, value);
    }
}
