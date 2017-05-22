package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Car implements Vehicle {

    private int fuelTankSize;
    private int gears;
    private double availableFuel;
    private FuelType fuelType;
    private double factoryAvgConsumptionPer100km;
    private double driveAvgConsumptionPer100km;
    private int currentGear;

    public Car(double fuel, FuelType fuelType, int fuelTankSize, int gears, double avgConsumption) {
        this.availableFuel = fuel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.factoryAvgConsumptionPer100km = avgConsumption;
    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(double km) {
        System.out.println("drive " + km);
        /**
         * calculeaza cat s-a consumat in functie de nr de km si treapta de viteza curenta
         *
         * case currentGear == 1
         *      calculateFuel(1, km);
         * case currentGear == 2
         *      calculateFuel(2, km);
         * case currentGear == 3
         *      calculateFuel(3, km);
         * case currentGear == 4
         *      calculateFuel(4, km);
         *
         */

    }


    public void shitGear(int gear) {
        System.out.println("shitGear " + gear);
        this.currentGear = gear;
    }

    public double getAvailableFuel() {
        return this.availableFuel;
    }

    public double getAvgFuelPer100km() {
        return this.driveAvgConsumptionPer100km;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }
}
