package pl.mpas.advanced_programing.comparing.ref_method;

import pl.mpas.advanced_programing.comparing.cars.Car;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class CompoundCarOrder {

    public static int orderByBrandNextByModelNextByYear(Car first, Car second) {

        int comparingResult = first.getBrand().compareTo(second.getBrand());
        if (0 != comparingResult) {
            return comparingResult;
        }
        comparingResult = first.getModel().compareTo(second.getModel());
        if (0 != comparingResult) {
            return comparingResult;
        }

        return first.getYearOfProduction().compareTo(second.getYearOfProduction());

    }
}
