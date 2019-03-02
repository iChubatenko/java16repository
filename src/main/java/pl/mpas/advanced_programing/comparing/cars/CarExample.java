package pl.mpas.advanced_programing.comparing.cars;

import pl.mpas.advanced_programing.comparing.ref_method.CompareByModel;
import pl.mpas.advanced_programing.comparing.ref_method.CompoundCarOrder;

import java.time.Year;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarExample {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Volvo", "V40", "Blue", 156.f, Year.of(1998)),
                new Car("Opel", "Omega", "Gray", 131.f, Year.of(2000)),
                new Car("BMW", "Series 5", "Black", 354.f, Year.of(2010))

        );

        Collections.sort(cars);
        System.out.println("Сортуємо default: " + cars);

        Collections.sort(cars, Comparator.comparing(Car::getBrand));
        System.out.println("Сортуємо по марці: " + cars);

        Collections.sort(cars, Comparator.comparing(Car::getModel));
        System.out.println("Сортуємо по моделі: " + cars);

        Car carToCompare = new Car("Ford", "Focus", "Red", 197.f, Year.of(2014));
        carToCompare.maybeComparing((Car o) -> 1);

        System.out.println("After sorting by color...");
        Collections.sort(cars, new CarBrandComparator());
        System.out.println(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        });

        cars.sort((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));

        CompareByModel anotherModelComparingWay = new CompareByModel();

        cars.sort((car1, car2) -> {
            return anotherModelComparingWay.orderByModel(car1, car2);
        });

        cars.sort((car1, car2) -> anotherModelComparingWay.orderByModel(car1, car2));

        cars.sort(anotherModelComparingWay::orderByModel);

        cars.sort((o1, o2) -> CompoundCarOrder.orderByBrandNextByModelNextByYear(o1, o2));
        cars.sort(CompoundCarOrder::orderByBrandNextByModelNextByYear);

        cars.sort(Comparator.comparing(Car::getBrand).thenComparing(Car::getModel));
    }
}
