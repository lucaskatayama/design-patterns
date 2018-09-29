package fatory.example2;

import fatory.example2.animals.Animal;
import fatory.example2.animals.Cat;
import fatory.example2.animals.Dog;

public class AnimalFactory {


  public static Animal createAnimal(String petType, String petName) {
    Animal pet;
    switch(petType) {
      case "Dog":
        pet = new Dog(petName);
        break;
      case "Cat":
        pet = new Cat(petName);
        break;
      default:
        throw new IllegalArgumentException("No pet with type " + petType);
    }
    return pet;
  }
}
