package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;

public class Airport {
    private String name;
    private int id;
    private GeoLoc airportLoc;
    private int airplaneCapacity;

    private Airplane[] listOfCurrentAirplanes;
    private ArrayList<Airport> connections;

    public Airport() {
    }

    public Airport(String name, int capacity) {
        this.name = name;
        this.id =  0;
        this.airplaneCapacity = capacity;
        this.listOfCurrentAirplanes = new Airplane[airplaneCapacity];
        this.connections = new ArrayList<>();
    }


    public Airport(String name, int id, int capacity, GeoLoc loc) {
        this.name = name;
        this.id = id;
        this.airportLoc = loc;
        this.airplaneCapacity = capacity;
        this.listOfCurrentAirplanes = new Airplane[airplaneCapacity];
        this.connections = new ArrayList<>();
    }

    private Airport getConnection(int id) {
        if(connections == null) {
            System.out.println("Null");
        }
        for(Airport airport : connections) {
            if(airport.getId() == id) {
                return airport;
            }
        }
        return null;
    }

    private Airport getConnection(String name) {
        for(Airport airport : connections) {
            if(airport.getName().equals(name)) {
                return airport;
            }
        }
        return null;
    }

    public void appendConnection(Airport connection) {
        Airport newConnection = getConnection(connection.getId());
         if(newConnection != null) {
             return;
         }
         this.connections.add(connection);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (airplaneCapacity != airport.airplaneCapacity) return false;
        if (!Objects.equals(name, airport.name)) return false;
        if (!Objects.equals(id, airport.id)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(listOfCurrentAirplanes, airport.listOfCurrentAirplanes)) return false;
        return Objects.equals(connections, airport.connections);
    }

    @Override
    public String toString() {
        String getInfo = this.name + ": ";
        if(connections != null) {
            for (Airport airport : connections) {
                getInfo += airport.getName() + ", ";
            }
        }
        return getInfo;
    }

    public void printAirport() {
        System.out.println(this.getName());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAirplaneCapacity() {
        return airplaneCapacity;
    }

    public void setAirplaneCapacity(int airplaneCapacity) {
        this.airplaneCapacity = airplaneCapacity;
    }

    public GeoLoc getAirportLoc() {
        return airportLoc;
    }

    public void setAirportLoc(GeoLoc airportLoc) {
        this.airportLoc = airportLoc;
    }

    public Airplane[] getListOfCurrentAirplanes() {
        return listOfCurrentAirplanes;
    }

    public void setListOfCurrentAirplanes(Airplane[] listOfCurrentAirplanes) {
        this.listOfCurrentAirplanes = listOfCurrentAirplanes;
    }

    public ArrayList<Airport> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Airport> connections) {
        this.connections = connections;
    }
}
