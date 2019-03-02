package pl.mpas.advanced_programing;

@FunctionalInterface
interface SayHello {
    void sayHello();
    default void goodbye() {
        System.out.println("Goodbye!!!");
    }
}

@FunctionalInterface
interface Test {
    void people(int wiek, String name);
    default void myName() {
        System.out.println("Ihor");
    }
    default void myAge(int myAge, String myName) {
        System.out.println(21);
    }
}

public class HelloLambda {

    public static void main(String[] args) {
        SayHello hello = () -> {};
        hello.sayHello();

        useTest((wiek, name) -> System.out.println("" + wiek + wiek + " -- " + name + name)
                ,5, "Mariusz");

        useTest((wiek, name) -> System.out.println(" " + wiek + " " + wiek + " " + wiek + " --- " + name + " " + name + " " + name)
                , 3, "Ihor");


        useTest(new Test() {
            @Override
            public void people(int wiek, String name) {

            }
        }, 5, "a");
    }

    static void useTest (Test test, int myAge, String myName) {
        test.people(myAge, myName);
    }

}
