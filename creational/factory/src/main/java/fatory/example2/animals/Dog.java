package fatory.example2.animals;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public void makeSound() {
    System.err.println("Bow Bow");
  }

  public void moveAround() {
    System.err.println(getName() + " is jumping around.");
  }
}
