package pl.mpas.advanced_programing.generic;

public class MyThirdGeneric <T, V> {

    private T name;
    private V surname;

    public MyThirdGeneric(T name, V surname) {
        this.name = name;
        this.surname = surname;
    }

    public T getName() {
        return name;
    }

    public V getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "MyThirdGeneric{" +
                "name=" + name +
                ", surname=" + surname +
                '}';
    }
}
