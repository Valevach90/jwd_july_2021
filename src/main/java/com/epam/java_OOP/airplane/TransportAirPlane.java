package com.epam.java_OOP.airplane;

import java.util.Objects;

public class TransportAirPlane extends AirPlane {
    private int capacity;


    public TransportAirPlane(int flightRange, int fuelConsumption, String model, int capacity) {
        super(flightRange, fuelConsumption, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Model{" + super.getModel() +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransportAirPlane that = (TransportAirPlane) o;
        return capacity == that.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
