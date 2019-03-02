package pl.mpas.advanced_programing.abstract_class;

public class AnimalExample {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.handleAnimal(new Animal("Azor") {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }

            @Override
            public void play() {

            }
        });

        Animal maybeCat = null;
        new Animal("cat") {
            @Override
            public void eat() {

            }

            @Override
            public void play() {

            }

            public void miauu() {

            }
        }.miauu();

        Object o = "ala";
        ((String) o).length();
    }
}
