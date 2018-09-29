package fatory.example1;

import fatory.example1.animals.Animal;
import fatory.example1.animals.Cat;
import fatory.example1.animals.Dog;

public class PetStore {

  /**
   * Single Responsibility Principle
   *   - This method is ordering a pet and creating a pet
   * Open/Close Principle
   *   - If I want to add the Fish animal, I need to modify this class
   *   in order to extends its behaviour to work with Fish
   **/
  public Animal orderPet(String petType, String petName) {
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
