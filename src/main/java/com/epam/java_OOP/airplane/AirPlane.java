package com.epam.java_OOP.airplane;

public class AirPlane {
    private int flightRange;
    private int fuelConsumption;
    private String model;


    public String getModel() {
        return model;
    }


    public AirPlane(int flightRange, int fuelConsumption,  String model) {
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.model = model;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "flightRange=" + flightRange +
                ", fuelConsumption=" + fuelConsumption +
                ", model='" + model + '\'' +
                '}';
    }
}
