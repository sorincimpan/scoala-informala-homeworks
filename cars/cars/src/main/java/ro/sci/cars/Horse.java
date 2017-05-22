package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Horse implements Vehicle {

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(double km) {
        System.out.println("drive");
    }

    public void shiftGear(int gear) {
        System.out.println("shiftGear");
    }

    public double getAvailableFuel() {
        return 0;
    }

    public double getAvgFuelPer100km() {
        return 0;
    }

    public FuelType getFuelType() {
        return FuelType.OVAZ;
    }
}
