package com.epam.java_OOP;

import com.epam.java_OOP.air_company.AirCompany;
import com.epam.java_OOP.airplane.AirPlane;
import com.epam.java_OOP.airplane.CargoAirPlane;
import com.epam.java_OOP.airplane.TransportAirPlane;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CargoAirPlane a220 = new CargoAirPlane(800,300,"A220",300);
        CargoAirPlane a320 = new CargoAirPlane(1000,500,"A320",650);
        TransportAirPlane b220 = new TransportAirPlane(1300,500,"B220",120);
        TransportAirPlane b320 = new TransportAirPlane(2000,400,"B320",180);
        List<AirPlane> airPlanes = new ArrayList<>();
        airPlanes.add(a220);
        airPlanes.add(a320);
        airPlanes.add(b220);
        airPlanes.add(b320);
        List<CargoAirPlane> cargoAirPlanes = new ArrayList<>();
        cargoAirPlanes.add(a220);
        cargoAirPlanes.add(a320);
        List<TransportAirPlane> transportAirPlanes = new ArrayList<>();
        transportAirPlanes.add(b220);
        transportAirPlanes.add(b320);
        AirCompany myAirCompany = new AirCompany(cargoAirPlanes,transportAirPlanes,airPlanes);
        myAirCompany.menu(myAirCompany.userInput());
    }
}
