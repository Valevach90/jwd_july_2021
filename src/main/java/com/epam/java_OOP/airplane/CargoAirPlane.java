package com.epam.java_OOP.airplane;

import java.util.Objects;

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
        return "Model{" +super.getModel()+
                "liftingCapasity=" + liftingCapasity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoAirPlane that = (CargoAirPlane) o;
        return liftingCapasity == that.liftingCapasity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapasity);
    }
}
