package com.epam.java_OOP.air_company;

import com.epam.java_OOP.airplane.AirPlane;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AirCompany {

    private List<AirPlane> airPlanes;

    public AirCompany(List<AirPlane> airPlanes) {
        this.airPlanes = airPlanes;
    }

    public int capacityCount() {
        return airPlanes.stream().collect(Collectors
                .summingInt(airPlaneCapacity -> airPlaneCapacity
                        .getTransportAirPlane()
                        .getCapacity()));
    }

    public int liftingCapasityCount() {
        return airPlanes.stream().collect(Collectors
                .summingInt(airPlaneCapacity -> airPlaneCapacity
                        .getCargoAirPlane()
                        .getLiftingCapasity()));
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
                capacityCount();
                break;
            case 2:
                liftingCapasityCount();
                break;
            case 3:
                flightRangeFilter(airPlanes,userInput());
                break;
            case 4:
                fuelConsumptionSearching(airPlanes,userInput());
                break;
            default:
                System.out.println("Wrong input");;
                break;
        }
    }
}
