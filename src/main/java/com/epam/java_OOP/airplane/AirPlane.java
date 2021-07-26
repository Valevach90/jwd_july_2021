package com.epam.java_OOP.airplane;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return flightRange == airPlane.flightRange && fuelConsumption == airPlane.fuelConsumption && Objects.equals(model, airPlane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightRange, fuelConsumption, model);
    }
}
