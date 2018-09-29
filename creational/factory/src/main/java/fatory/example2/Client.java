package fatory.example2;

import fatory.example2.animals.Animal;

public class Client {
  public static void main(String[] args) {
    PetStore petStore = new PetStore();
    Animal pet = petStore.orderPet("Dog", "Chiba");
    pet.makeSound();
    pet.moveAround();
  }
}
