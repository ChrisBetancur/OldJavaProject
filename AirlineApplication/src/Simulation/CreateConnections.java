package Simulation;

import Airline.AirlineSystem;
import Model.Airport;
import Model.Flight;
import Utilities.SortArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

import static Utilities.FlightCalculator.calculateDistance;
public class CreateConnections {

    private static Airport[] list;
    private static AirlineSystem airlineSystem;

    private static final int MIN_SMALL_AIRPORT_VALUES = 10;
    private static final int MAX_SMALL_AIRPORT_VALUES = 15;

    private static final int MIN_LARGE_AIRPORT_VALUES = 15;
    private static final int MAX_LARGE_AIRPORT_VALUES = 25;


    public CreateConnections(Airport[] list) {
        this.list = list;
        airlineSystem = new AirlineSystem();

    }

    public void generateConnections() {
        int index = 0;
        final long startTime = System.currentTimeMillis();

        for(Airport airport : list) {
            int connections = numOfConnections(airport);
            findClosestAirports(airport, connections);
            index++;
        }
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime)/1000);
        //System.out.println("Hello");

    }

    private int numOfConnections(Airport airport) {
        Random rand = new Random();

        int numOfConnections;

        if(airport.getAirplaneCapacity() == 10) {
            numOfConnections = rand.nextInt(MAX_SMALL_AIRPORT_VALUES - MIN_SMALL_AIRPORT_VALUES) + MIN_SMALL_AIRPORT_VALUES;
        }
        else {
            numOfConnections = rand.nextInt(MAX_LARGE_AIRPORT_VALUES - MIN_LARGE_AIRPORT_VALUES) + MIN_LARGE_AIRPORT_VALUES;
        }
        //System.out.println(numOfConnections);
        return numOfConnections;
    }

    //MAKE THIS FASTER AND MORE EFFICIENT - TOO SLOW
    private void findClosestAirports(Airport src, int numOfConnections) {

        double[] distances = new double[list.length];

        HashMap<Double, Airport> flightToDest = new HashMap<>();
        //System.out.println("Start");
        for(int i = 0; i < list.length; i++) {
            if (!list[i].getName().equals(src.getName())) {
                double distance = calculateDistance(src.getAirportLoc(), list[i].getAirportLoc());
                distances[i] = distance;
                flightToDest.put(distance, list[i]);
            }
        }
        //System.out.println("done");

        SortArray.sortDouble(distances);

        // System.out.println("Start");
        for(int i = 0; i < numOfConnections; i++) {
            Airport airportName = flightToDest.get(distances[i]);

                // Set to two way
            if(airportName != null) airlineSystem.appendAirport(src, airportName, false);

           // System.out.println(i);
        }
        //System.out.println("done");
    }

    public AirlineSystem getAirlineSystem() {
        return airlineSystem;
    }
}
