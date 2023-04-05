package Model;

import java.util.Objects;

public class Flight {
    private Airport source;
    private Airport destination;
    private double distance; //in km
    private int flightDuration; //in minutes

    public Flight() {
    }

    public Flight(Airport source, Airport destination) {
        this.source = source;
        this.destination = destination;
        this.flightDuration = 0;
        //this.haversineCalculator();
    }

    private void calculateFlightDuration() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightDuration != flight.flightDuration) return false;
        if (!Objects.equals(source, flight.source)) return false;
        return Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + flightDuration;
        return result;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Airport getSource() {
        return source;
    }

    public void setSource(Airport source) {
        this.source = source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }
}
