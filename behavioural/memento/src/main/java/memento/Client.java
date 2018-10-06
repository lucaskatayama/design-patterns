package memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticle("State 1");
        careTaker.addMemento(originator.save());

        printState(originator);

        originator.setArticle("State 2");
        careTaker.addMemento(originator.save());

        printState(originator);

        originator.restore(careTaker.undo());

        printState(originator);

        originator.restore(careTaker.redo());

        printState(originator);
    }

    public static void printState(Originator o) {
        System.err.println("Current state: " + o.getArticle());
    }
}
