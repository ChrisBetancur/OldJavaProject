package Airline;

import Model.Airport;
import Model.Flight;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;

public class AirlineSystem {
    private ArrayList<Airport> airportSystem;
    private ArrayList<Flight> listOfFlights;
    private final int DEFAULT_AIRPLANE_CAPACITY = 10;

    public AirlineSystem() {
        airportSystem = new ArrayList<>();
        listOfFlights = new ArrayList<>();
    }

    public AirlineSystem(ArrayList<Airport> airportSystem) {
        this.airportSystem = airportSystem;
    }

    private Airport getAirport(int id) {
        for(Airport airport : airportSystem) {
            if(airport.getId() == id) {
                return airport;
            }
        }
        return null;
    }

    private Airport getAirport(String name) {
        for(Airport airport : airportSystem) {
            if(airport.getName().equals(name)) {
                return airport;
            }
        }
        return null;
    }

    private Airport createAirport(String name, int airplaneCapacity) {
        return new Airport(name, airplaneCapacity);
    }

    public void appendAirport(Airport source, Airport destination, boolean isTwoWay) {
        //System.out.println(source.getName());
        if(getAirport(source.getId()) == null) {
            airportSystem.add(source);
        }
        if(getAirport(destination.getId()) == null) {
            airportSystem.add(destination);
        }
        source.appendConnection(destination);
        //System.out.println(destination.getId());
        if(!doesFlightExist(source, destination)) {
            listOfFlights.add(new Flight(source, destination));
        }
        if(isTwoWay) {
            destination.appendConnection(source);
        }
    }

    public void appendAirportByString(String source, String destination, int flightDuration, boolean isTwoWay) {
        Airport src = getAirport(source);
        Airport dest = getAirport(destination);

        if(src == null) {
            src = createAirport(source, DEFAULT_AIRPLANE_CAPACITY);
            airportSystem.add(src);
        }
        if(dest == null) {
            dest = createAirport(destination, DEFAULT_AIRPLANE_CAPACITY);
            airportSystem.add(dest);
        }
        src.appendConnection(dest);

        if(!doesFlightExist(src, dest)) {
            //listOfFlights.add(new Flight(src, dest, flightDuration));
        }

        if(isTwoWay) {
            dest.appendConnection(src);
        }
    }

    public boolean doesFlightExist(Airport source, Airport destination) {
        for(Flight flight : listOfFlights) {
            if(flight.getSource().equals(source) && flight.getDestination().equals(destination)) {
                return true;
            }
        }
        return false;
    }

    public void printAirportSystemConnections() {
        for(Airport airport : airportSystem) {
            System.out.println(airport.toString());
        }
    }

    public void printAirportConnectionsOnly() {
        for(Airport airport : airportSystem) {
            if(!airport.getConnections().isEmpty()) {
                //System.out.println(airport.toString());
                int num = 0;

                for(Airport a : airport.getConnections()) {
                    num++;
                }
                System.out.println(num);
            }
        }
    }

    public void printFlights() {
        for(Flight flight : listOfFlights) {
            System.out.println(flight.getSource().getName() + " to " + flight.getDestination().getName() + " for " + flight.getFlightDuration() + " min");
        }
    }

    public ArrayList<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public ArrayList<Airport> getAirportSystem() {
        return airportSystem;
    }

    public void setAirportSystem(ArrayList<Airport> airportSystem) {
        this.airportSystem = airportSystem;
    }
}
