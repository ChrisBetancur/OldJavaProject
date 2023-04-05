package Model;

public class GeoLoc {
    private double latitude;
    private double longitude;

    public GeoLoc() {
    }

    public GeoLoc(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GeoLoc(double lat, double lng) {
        this.latitude = lat;
        this.longitude = lng;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
}
