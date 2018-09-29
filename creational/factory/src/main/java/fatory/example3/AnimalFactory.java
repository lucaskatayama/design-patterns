package fatory.example3;

import fatory.example3.animals.Animal;

public interface AnimalFactory {
  Animal createAnimal(String petType, String petName);
}
