package pl.mpas.advanced_programing.stream;

import javafx.collections.transformation.SortedList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Item> saturdayItems = Arrays.asList(
                new Item("kino", BigDecimal.valueOf(35.00),
                        Arrays.asList(new Ingredient("paper"))),
                new Item("chlebek", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredient("sugar"), new Ingredient("H2O")))
        );

        Order saturdayShopping = new Order(saturdayItems);

        List<Item> sundayItems = Arrays.asList(
                new Item("Cola", BigDecimal.valueOf(30.00),
                        Arrays.asList(new Ingredient("e52"), new Ingredient("uran")))
        );

        Order sundayShopping = new Order(sundayItems);

        getIngredientsNames(Arrays.asList(sundayShopping, saturdayShopping));

    }

    public static List<String> getIngredientsNames(List<Order> orders) {

        return orders.stream()
                .flatMap(order -> order.getMyItem().stream())
                .flatMap(item -> item.getIngredientsList().stream())
                .map(ingredient -> ingredient.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public static BigDecimal getValuePrice(List<Order> orders) {

        return orders.stream()
                .flatMap(order -> order.getMyItem().stream())
                .map(item -> item.getPrice())
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2));
    }

    public static List<String> getIngredientsNames2(List<Order> orders) {

        List<String> result = new ArrayList<>();

        return orders.stream()
                .flatMap(order -> order.getMyItem().stream())
                .flatMap(item -> item.getIngredientsList().stream())
                .map(ingredient -> ingredient.getName())
                .distinct()
                .reduce(result, (strings, s) -> {
                    strings.add(s);
                    System.out.println(strings);
                    return strings;
                }, (strings, strings2) -> result);

    }

}
