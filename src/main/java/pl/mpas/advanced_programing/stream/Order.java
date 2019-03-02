package pl.mpas.advanced_programing.stream;

import java.util.List;

public class Order {

    List<Item> myItem;

    public Order(List<Item> myItem) {
        this.myItem = myItem;
    }

    public List<Item> getMyItem() {
        return myItem;
    }
}
