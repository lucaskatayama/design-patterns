public class Client {
  public static void main(String[] args) {
    SubTree root = new SubTree();
    Node helloNode = new HelloNode();
    Node goodByeNode = new GoodByeNode();
    root.add(helloNode);


    SubTree subTree = new SubTree();
    subTree.add(goodByeNode);
    subTree.add(goodByeNode);

    SubTree subTree2 = new SubTree();
    subTree.add(helloNode);
    subTree.add(helloNode);

    subTree.add(subTree2);
    root.add(subTree);
    root.add(subTree);

    root.doSomething();

  }
}
