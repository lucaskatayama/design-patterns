package fatory.example1.animals;

public class Fish extends Animal {
  public Fish(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.err.println("Glub glub");
  }

  @Override
  public void moveAround() {
    System.err.println(getName() + " is swimming around.");
  }
}
