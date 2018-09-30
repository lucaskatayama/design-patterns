package singleton;

public class Client {
    public static void main(String[] args) {
        FirstSingleton firstSingleton = FirstSingleton.getInstance();
        System.err.println(firstSingleton.getValue());
        firstSingleton.setValue(2);
        System.err.println(firstSingleton.getValue());


        SecondSingleton secondSingleton = SecondSingleton.INSTANCE;
        System.err.println(secondSingleton.getValue());
        secondSingleton.setValue(2);
        System.err.println(secondSingleton.getValue());

    }
}
