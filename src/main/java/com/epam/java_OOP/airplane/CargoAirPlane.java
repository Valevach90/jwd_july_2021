package com.epam.java_OOP.airplane;

public class CargoAirPlane extends AirPlane {
    private int liftingCapasity;


    public CargoAirPlane(int flightRange, int fuelConsumption,  String model, int liftingCapasity) {
        super(flightRange, fuelConsumption, model);
        this.liftingCapasity = liftingCapasity;
    }

    public int getLiftingCapasity() {
        return liftingCapasity;
    }

    @Override
    public String toString() {
        return "CargoAirPlane{" +
                "liftingCapasity=" + liftingCapasity +
                '}';
    }
}
