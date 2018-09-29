package fatory.example3;

import fatory.example3.animals.Animal;

public class Client {
  public static void main(String[] args) {
    PetStore petStore = new PetStore(new PetStoreFactory());
    Animal pet = petStore.orderPet("Dog", "Chiba");
    pet.makeSound();
    pet.moveAround();


    // Changing the way animals are created,
    // Creation is INDEPENDENT from PetStore ordeing
    petStore = new PetStore(new PetStoreV2Factory());
    pet = petStore.orderPet("Dog", "Chiba");
    pet.makeSound();
    pet.moveAround();
  }
}
