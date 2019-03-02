package pl.mpas.advanced_programing.comparing.cars;

import java.time.Year;

public class Car implements Comparable<Car>{

    private String brand;
    private String model;
    private String color;
    private float capacity;
    private Year yearOfProduction;

    public Car(String brand, String model, String color, float capacity, Year yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public float getCapacity() {
        return capacity;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public void maybeComparing(Comparable<Car> comparable) {
        System.out.println("Inside maybeComparing()");
        System.out.println(comparable.compareTo(this));

    }

    @Override
    public int compareTo(Car o) {
        return yearOfProduction.compareTo(o.getYearOfProduction());
        //return this.yearOfProduction.getValue() - o.yearOfProduction.getValue();
    }
}




