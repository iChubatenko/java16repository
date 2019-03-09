package pl.mpas.advanced_programing.generic;

import pl.mpas.advanced_programing.abstract_class.Cat;
import pl.mpas.advanced_programing.abstract_class.Dog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecretExample {

    public static void main(String[] args) {
        MyStringSecret dream = new MyStringSecret("Hahaha");
        MyBigDecimalSecret incons = new MyBigDecimalSecret(BigDecimal.ZERO);

        MySecretGenericV1 integer = new MySecretGenericV1(Integer.valueOf(1));

        MySecretGenericV1 anotherDream = new MySecretGenericV1("Ahahaha");

        //MyThirdGeneric name = new MyThirdGeneric("Ihor");

        Integer secretInteger = (Integer) integer.getObject();

        checkMySecret(integer);
        checkMySecret(anotherDream);

        List animals = new ArrayList();
        animals.add(new Dog("Azor"));
        animals.add(new Cat("Fifi"));
        checkAnimals(animals);

        MySecondGeneric<String> stringSecret = new MySecondGeneric<>("secret");
        MySecondGeneric<BigDecimal> futureIncome = new MySecondGeneric<>(BigDecimal.valueOf(1_000_000));
    }

    public static void checkAnimals(List animals) {
        for (Object animal: animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog");
            } else if (animal instanceof Cat) {
                System.out.println("Cat");
            } else {
                System.out.println("Unknow Animal");
            }
        }
    }

    public static void checkMySecret(MySecretGenericV1 secretGenericV1) {

        if (secretGenericV1.getObject() instanceof Integer) {
            Integer secret = (Integer) secretGenericV1.getObject();
            System.out.println("Secret: " + secret);
        }
    }
}