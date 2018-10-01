package solution;

import java.util.LinkedList;
import java.util.List;

public class ConcreteCollection implements IterableCollection {
    List<String> internalList = new LinkedList<String>();

    public Iterator createIterator() {
        return new ConcreteCollectionIterator(this);
    }

    public ConcreteCollection() {
        internalList.add("Hello");
        internalList.add("World");
    }

    public int size() {
        return this.internalList.size();
    }

    public String getStringAt(int i) {
        return internalList.get(i);
    }
}
