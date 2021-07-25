package com.epam.java_OOP.airplane;

public class AirPlane {
    private int flightRange;
    private int fuelConsumption;
    private CargoAirPlane cargoAirPlane;
    private TransportAirPlane transportAirPlane;
    private String model;

    public CargoAirPlane getCargoAirPlane() {
        return cargoAirPlane;
    }

    public String getModel() {
        return model;
    }

    public TransportAirPlane getTransportAirPlane() {
        return transportAirPlane;
    }

    public AirPlane(int flightRange, int fuelConsumption, String model) {
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
        return "airPlane{" +
                "flightRange=" + flightRange +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
