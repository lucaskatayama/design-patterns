public class ServiceProxy implements ServiceInterface {
  ServiceInterface serviceInterfaceImpl;

  public ServiceProxy(ServiceInterface serviceInterface) {
    this.serviceInterfaceImpl = serviceInterface;
  }

  public void operation() {
    System.err.println("Logging something before");
    this.serviceInterfaceImpl.operation();
  }
}
