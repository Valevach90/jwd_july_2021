package com.epam.java_OOP.air_company;

import com.epam.java_OOP.airplane.AirPlane;
import com.epam.java_OOP.airplane.CargoAirPlane;
import com.epam.java_OOP.airplane.TransportAirPlane;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AirCompany {

    private List<CargoAirPlane> cargoAirPlanes;
    private List<TransportAirPlane> transportAirPlanes;
    private List<AirPlane> airPlanes;

    public AirCompany(List<CargoAirPlane> cargoAirPlanes, List<TransportAirPlane> transportAirPlanes, List<AirPlane> airPlanes) {
        this.cargoAirPlanes = cargoAirPlanes;
        this.transportAirPlanes = transportAirPlanes;
        this.airPlanes = airPlanes;
    }

    public int capacityCount() {
        return transportAirPlanes.stream().mapToInt(capacity -> capacity.getCapacity()).sum();
    }

    public int liftingCapacityCount() {
        return cargoAirPlanes.stream().mapToInt(capacity->capacity.getLiftingCapasity()).sum();
    }

    public List<AirPlane> flightRangeFilter(List<AirPlane> airPlanes, int flightRange) {
        return airPlanes.stream().filter(airPlaneFlightRange -> airPlaneFlightRange
                .getFlightRange() >= flightRange)
                .collect(Collectors.toList());
    }

    public List<AirPlane> fuelConsumptionSearching(List<AirPlane> airPlanes, int fuelConsumption) {
        return airPlanes.stream().filter(airPlane -> airPlane.getFuelConsumption() == fuelConsumption)
                .collect(Collectors.toList());
    }
    public int userInput(){
        System.out.println("Enter current value for searching");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public void menu(int inPut) {
        switch(inPut) {
            case 1:
                System.out.println(capacityCount());
                break;
            case 2:
                System.out.println(liftingCapacityCount());
                break;
            case 3:
                System.out.println( flightRangeFilter(airPlanes,userInput()));
                break;
            case 4:
                System.out.println( fuelConsumptionSearching(airPlanes,userInput()));
                break;
            default:
                System.out.println("Wrong input");;
                break;
        }
    }

    public List<CargoAirPlane> getCargoAirPlanes() {
        return cargoAirPlanes;
    }

    public List<TransportAirPlane> getTransportAirPlanes() {
        return transportAirPlanes;
    }

    public List<AirPlane> getAirPlanes() {
        return airPlanes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirCompany that = (AirCompany) o;
        return Objects.equals(cargoAirPlanes, that.cargoAirPlanes) && Objects.equals(transportAirPlanes, that.transportAirPlanes) && Objects.equals(airPlanes, that.airPlanes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargoAirPlanes, transportAirPlanes, airPlanes);
    }
}
