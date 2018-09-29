package fatory.example2;

import fatory.example2.animals.Animal;

public class PetStore {

  /**
   * Refactor to apply Single Responsibility
   */
  public Animal orderPet(String petType, String petName) {
    Animal pet = AnimalFactory.createAnimal(petType, petName);

    return pet;
  }
}
