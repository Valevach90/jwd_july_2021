package com.epam.java_OOP.airplane;

import java.util.Objects;

public class TransportAirPlane extends AirPlane {
    private int PasagerCapacity;


    public TransportAirPlane(int flightRange, int fuelConsumption, String model, int capacity) {
        super(flightRange, fuelConsumption, model);
        this.PasagerCapacity = capacity;
    }

    public int getPasagerCapacity() {
        return PasagerCapacity;
    }

    @Override
    public String toString() {
        return "Model{" + super.getModel() +
                "capacity=" + PasagerCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransportAirPlane that = (TransportAirPlane) o;
        return PasagerCapacity == that.PasagerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), PasagerCapacity);
    }
}
