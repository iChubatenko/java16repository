package pl.mpas.advanced_programing.generic;

import pl.mpas.advanced_programing.abstract_class.Animal;

public class MySecondGeneric<T> {

    private T object;

    public MySecondGeneric(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MySecretGenericV1{" +
                "object=" + object +
                '}';
    }
}
