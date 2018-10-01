package solution;

public class Client {
    public static void main(String[] args) {
        IterableCollection collection = new ConcreteCollection();
        Iterator it = collection.createIterator();
        while(it.hasMore()) {
            String result = it.getNext();
            System.err.println(">>" + result);
        }
    }
}
