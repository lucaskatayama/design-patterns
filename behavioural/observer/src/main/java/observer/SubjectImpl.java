package observer;

import java.util.LinkedList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> observers = new LinkedList<Observer>();
    Integer state = 0;


    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        this.observers.forEach((Observer observer) -> {
            observer.update(this.state);
        });
    }

    public void setState(Integer state) {
        this.state = state;
        notifyObservers();
    }
}
