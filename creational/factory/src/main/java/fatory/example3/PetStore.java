package fatory.example3;

import fatory.example3.animals.Animal;

public class PetStore {

  AnimalFactory animalFactory;

  public PetStore(AnimalFactory animalFactory) {
    this.animalFactory = animalFactory;
  }

  /**
   * Refactor to apply Single Responsibility
   */
  public Animal orderPet(String petType, String petName) {
    Animal pet = animalFactory.createAnimal(petType, petName);

    return pet;
  }
}
