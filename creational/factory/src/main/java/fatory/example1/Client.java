package fatory.example1;

import fatory.example1.animals.Animal;

public class Client {
  public static void main(String[] args) {
    PetStore petStore = new PetStore();
    Animal pet = petStore.orderPet("Dog", "Chiba");
    pet.makeSound();
    pet.moveAround();
  }
}
