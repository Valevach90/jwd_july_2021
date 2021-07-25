package com.epam.java_OOP.airplane;

public class TransportAirPlane extends AirPlane {
    private int capacity;


    public TransportAirPlane(int flightRange, int fuelConsumption, String model, int capacity) {
        super(flightRange, fuelConsumption,  model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "transportAirPlane{" +
                "capacity=" + capacity +
                '}';
    }
}
