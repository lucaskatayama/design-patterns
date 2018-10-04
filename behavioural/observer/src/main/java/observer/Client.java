package observer;


public class Client {
    public static void main(String[] args) {
        Observer ob1 = new Person("John Doe");
        Observer ob2 = new Person("Jane Doe");
        Observer ob3 = new Person("John Deo");
        Observer ob4 = new Person("Jane Doe");

        Subject subject = new SubjectImpl();
        subject.register(ob1);
        subject.register(ob2);
        subject.notifyObservers();

        ((SubjectImpl) subject).setState(2);


        subject.register(ob3);
        subject.notifyObservers();

        subject.unregister(ob1);
        ((SubjectImpl) subject).setState(4);

    }
}
