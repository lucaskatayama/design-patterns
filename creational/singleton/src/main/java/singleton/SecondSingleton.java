package singleton;

public enum SecondSingleton {
    INSTANCE;

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
