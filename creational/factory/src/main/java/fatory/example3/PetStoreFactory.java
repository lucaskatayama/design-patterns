package fatory.example3;

import fatory.example3.animals.Animal;
import fatory.example3.animals.Cat;
import fatory.example3.animals.Dog;

public class PetStoreFactory implements AnimalFactory {

  public Animal createAnimal(String petType, String petName) {
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
