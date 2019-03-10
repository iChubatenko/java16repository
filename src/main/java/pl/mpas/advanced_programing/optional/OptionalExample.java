package pl.mpas.advanced_programing.optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        doSomething("Ala ma kota");
        doSomething("Ala ma kota");
        doSomething("Ala ma kota");
        doSomething("Ala ma kota");
        doSomething(null);

    }

    public static void doSomething(String isNullorNot) {

        Objects.requireNonNull(isNullorNot);
        //Optional.ofNullable(isNullorNot);
        Optional.of(isNullorNot);
    }

    public static Optional<String> getPersonNick() {
        return Optional.empty();
    }
}
