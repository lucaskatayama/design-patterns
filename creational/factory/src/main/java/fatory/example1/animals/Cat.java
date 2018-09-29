package fatory.example1.animals;

public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  public void makeSound() {
    System.err.println("Meow");
  }

  public void moveAround() {
    System.err.println(getName() + " is moving around");
  }
}
