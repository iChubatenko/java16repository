package pl.mpas.advanced_programing.abstract_class;

public class Dog extends Animal {

    public Dog (String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
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
