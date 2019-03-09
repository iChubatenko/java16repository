package pl.mpas.advanced_programing.abstract_class;

import pl.mpas.advanced_programing.comparing.cars.Car;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
