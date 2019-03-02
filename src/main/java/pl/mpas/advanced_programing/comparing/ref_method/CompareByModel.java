package pl.mpas.advanced_programing.comparing.ref_method;

import pl.mpas.advanced_programing.comparing.cars.Car;

public class CompareByModel {

    public int orderByModel(Car first, Car second) {
        return first.getModel().compareTo(second.getModel());
    }
}
