package pl.mpas.advanced_programing.generic;

import pl.mpas.advanced_programing.abstract_class.Animal;
import pl.mpas.advanced_programing.abstract_class.Cat;
import pl.mpas.advanced_programing.abstract_class.Dog;

public class ArraysTest {

    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Tuzik");
        dogs[1] = new Dog("Vasya");

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Murzik");
        cats[1] = new Cat("Sonya");

        Animal[] animals = dogs;
        Object[] objects = animals;

        displayAnimals(cats);
        displayAnimals(dogs);

        addDog(dogs);
        addDog(cats);

        System.out.println(animals);
    }

    public static void addDog(Animal[] animals) {
        animals[0] = new Dog("Grysha");
    }

    public static void displayAnimals(Animal[] animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
