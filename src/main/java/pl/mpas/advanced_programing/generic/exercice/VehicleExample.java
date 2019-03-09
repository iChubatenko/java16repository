package pl.mpas.advanced_programing.generic.exercice;

import java.util.ArrayList;
import java.util.List;

public class VehicleExample {

    public static void main(String[] args) {
        List<Airplane> vehicles = new ArrayList<>();
        List<Vehicle> maybeCars = new ArrayList<>();

        VehicleProcessor.addNewCarIntoList(maybeCars);
        VehicleProcessor.displayVehicle(vehicles);
    }
}
