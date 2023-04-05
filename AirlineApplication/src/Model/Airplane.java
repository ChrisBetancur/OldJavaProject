package Model;

import Utilities.AircraftType;

public class Airplane {
    private AircraftType aircraftType;
    private boolean isInFlight;
    private Airport airplaneLocation;

    public Airplane(AircraftType aircraftType, Airport airplaneLocation) {
        this.aircraftType = aircraftType;
        this.isInFlight = false;
        this.airplaneLocation = airplaneLocation;
    }

    public Airplane(AircraftType aircraftType, boolean isInFlight, Airport airplaneLocation) {
        this.aircraftType = aircraftType;
        this.isInFlight = isInFlight;
        this.airplaneLocation = airplaneLocation;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public boolean isInFlight() {
        return isInFlight;
    }

    public void setInFlight(boolean inFlight) {
        isInFlight = inFlight;
    }

    public Airport getAirplaneLocation() {
        return airplaneLocation;
    }

    public void setAirplaneLocation(Airport airplaneLocation) {
        this.airplaneLocation = airplaneLocation;
    }
}
