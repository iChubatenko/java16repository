package pl.mpas.advanced_programing.generic.exercice;

import javax.sound.midi.Soundbank;
import java.util.List;

public class VehicleProcessor {

    static void displayVehicle(List<? extends Vehicle> vehicles) {
            for (Vehicle vehicle: vehicles) {
                System.out.println(vehicle);
            }
        }

        static void addNewCarIntoList(List<? super Vehicle> vehicles) {

        vehicles.add(new Car("BMW"));
        System.out.println(vehicles);
    }
}
