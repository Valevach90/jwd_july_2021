package com.epam.java_OOP.airplane;

import java.util.Objects;

public class CargoAirPlane extends AirPlane {
    private int liftingCapacity;


    public CargoAirPlane(int flightRange, int fuelConsumption,  String model, int liftingCapasity) {
        super(flightRange, fuelConsumption, model);
        this.liftingCapacity = liftingCapasity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    @Override
    public String toString() {
        return "Model{" +super.getModel()+
                "liftingCapasity=" + liftingCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoAirPlane that = (CargoAirPlane) o;
        return liftingCapacity == that.liftingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }
}
