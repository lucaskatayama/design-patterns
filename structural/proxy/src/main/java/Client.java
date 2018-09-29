public class Client {

  public static void main(String[] args) {
    ServiceInterface serviceInterface1 = new ServiceProxy(new ServiceImpl1());
    ServiceInterface serviceInterface2 = new ServiceProxy(new ServiceImpl2());


    serviceInterface1.operation();
    serviceInterface2.operation();
  }
}
