import java.util.LinkedList;
import java.util.List;

public class SubTree implements Node {
  List<Node> subtree = new LinkedList<Node>();

  void add(Node e) {
    this.subtree.add(e);
  }

  void remove(Node e) {
    this.subtree.remove(e);
  }


  public void doSomething() {
    this.subtree.forEach(Node::doSomething);
  }
}
