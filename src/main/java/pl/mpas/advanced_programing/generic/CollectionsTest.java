package pl.mpas.advanced_programing.generic;

import pl.mpas.advanced_programing.abstract_class.Animal;
import pl.mpas.advanced_programing.abstract_class.Cat;
import pl.mpas.advanced_programing.abstract_class.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<Animal> soneList = new ArrayList<>();
        soneList.add(new Dog("Azor"));
        soneList.add(new Cat("Azor"));

        List<Dog> dogs = Arrays.asList(
                new Dog("Vasya"),
                new Dog("Petya")
        );

        List<Cat> cats = Arrays.asList(
                new Cat("Sonya"),
                new Cat("Lesya")
        );

        displayAnimals(dogs);
        displayAnimals(cats);
        addAnimal(soneList);
    }

    public static void displayAnimals(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public static void addAnimal(List<? extends Animal> animals) {

        //animals.add(new Dog("Zarya"));
        System.out.println(animals);
    }
}

