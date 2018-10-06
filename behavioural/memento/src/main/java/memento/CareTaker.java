package memento;

import java.util.LinkedList;
import java.util.List;

public class CareTaker {

    private List<Memento> history;

    private int currentState = -1;


    public CareTaker() {
        history = new LinkedList<Memento>();
    }

    public void addMemento(Memento m) {
        this.history.add(m);
        this.currentState = this.history.size() - 1;
    }

    private Memento getMemento(int index) {
        return this.history.get(index);
    }

    public Memento undo() {
        System.err.println("Undoing state...");

        currentState--;

        if (currentState <= 0) {
            this.currentState = 0;
        }

        return this.getMemento(currentState);
    }


    public Memento redo() {
        System.err.println("Redoing state...");

        currentState++;
        if (currentState >= history.size() - 1) {
            currentState = history.size() - 1;
        }

        return this.history.get(currentState);
    }
}
