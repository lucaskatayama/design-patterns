package solution;

public class ConcreteCollectionIterator implements Iterator {
    private ConcreteCollection collection;

    private int collectionSize;
    private int currentIndex;

    public ConcreteCollectionIterator(ConcreteCollection concreteCollection) {
        this.collection = concreteCollection;
        this.currentIndex = 0;
        this.collectionSize = concreteCollection.size();
    }

    public String getNext() {
        return this.collection.getStringAt(currentIndex++);
    }

    public boolean hasMore() {
        return currentIndex < collectionSize;
    }
}
