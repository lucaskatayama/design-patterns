package adapter;

public class Client {
  public static void main(String[] args) {
    Bird duck = new Duck();
    duck.makeSound();


    Bird plasticDuck = new BirdAdapter(new PlasticDuck());
    plasticDuck.makeSound();
  }
}
