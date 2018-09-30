package singleton;

public class FirstSingleton {

    private static FirstSingleton instance;
    int value;

    private FirstSingleton() {

    }

    // Problem with parallel threads
    public static FirstSingleton getInstance() {
        if (FirstSingleton.instance == null) {
            FirstSingleton.instance = new FirstSingleton();
        }
        return FirstSingleton.instance;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
