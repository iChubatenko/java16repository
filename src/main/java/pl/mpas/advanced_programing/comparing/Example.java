package pl.mpas.advanced_programing.comparing;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Mariusz", "P.", 20),
                new Person("Antoni", "W.", 30),
                new Person("Ola", "P.", 25)
        );

        Collections.sort(persons);
        System.out.println(persons);

        Collections.sort(persons, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
        System.out.println(persons);

        Collections.sort(persons, Comparator.comparing(Person::getSurname)
                .thenComparing(Person::getName));
        System.out.println(persons);
    }
}
