package fatory.example3;

import fatory.example3.animals.Animal;
import fatory.example3.animals.Cat;
import fatory.example3.animals.Dog;

public class PetStoreV2Factory implements AnimalFactory {
  @Override
  public Animal createAnimal(String petType, String petName) {
    Animal pet;
    switch(petType.toLowerCase()) {
      case "dog":
        pet = new Dog(petName);
        break;
      case "cat":
        pet = new Cat(petName);
        break;
      default:
        throw new IllegalArgumentException("No pet with type " + petType);
    }
    return pet;
  }
}
